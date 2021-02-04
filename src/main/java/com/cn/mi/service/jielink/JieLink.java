package com.cn.mi.service.jielink;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.TypeReference;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONUtil;
import com.cn.mi.config.jinlin.JieLinkConfig;
import com.cn.mi.entity.param.jielink.JieLinkKey;
import com.cn.mi.entity.result.IscResult;
import com.cn.mi.entity.result.jielink.JieLinkSign;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.List;


/**
 * created on 2021-01-19 15:59
 *
 * @author wub
 */
@Service
public class JieLink {


    /**
     * 捷顺平台_请求方法
     * @param url 方法url
     * @param param 参数
     * @return 结果
     */
    public String jieLinkSend(String url, String param) {

        JieLinkKey jieLinkKey = JieLinkKey.builder().userName(JieLinkConfig.userName).password(JieLinkConfig.passWord).build();

        String result = HttpRequest.post(JieLinkConfig.jieLinkPath+"/internal/sign").body(JSONUtil.toJsonStr(jieLinkKey)).execute().body();
        IscResult<List<JieLinkSign>> jieLinkResult = JSONUtil.toBean(result, new TypeReference<>() {
        }, true);
        String timestamp = StrUtil.toString(DateUtil.currentSeconds());

        String md5 = "random" + 123456 + "timestamp" + timestamp + "key" + jieLinkResult.getData().get(0).getKey();
        String sign = StrUtil.swapCase(SecureUtil.md5(md5));
        String appId=jieLinkResult.getData().get(0).getAppId();

        return HttpRequest.post(JieLinkConfig.jieLinkPath + url)
                .header("Accept", MediaType.APPLICATION_JSON_VALUE)
                .header("appId", appId)
                .header("v", "1.0")
                .header("random", "123456")
                .header("timestamp", timestamp)
                .header("sign", sign)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .charset(StandardCharsets.UTF_8)
                .body(param)
                .execute().body();
    }

}
