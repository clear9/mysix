package com.cn.mysix.ttes.tcp;
/**
 * @ClassName aaa
 * @Description aaa
 * @Author wub
 * @Date 2020/12/22 18:04
 * @Version 1.0
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * created on 2020-12-22 18:04
 * @author: momei
 *
 */
@NoArgsConstructor
@Data
public class aaa {


    /**
     * SrcFacePicBinaryData : /9j/4AAQSkZJRgABAQAAAQABAAD/2wBDAAMCAgMCAgMDAwMEAwMEBQgFBQQEBQoHBwYIDAoMDAsKCwsNDhIQDQ..
     * SrcFacePicUrl : http://10.21.22.115:6120/pic?7dd43=sb6-z67194163f7=11i5m*epdt=*4pdi=*1s=i1b4i6d03*918a05cf2-88d032--6733588i273*e7ic5=
     * DistFacePicBinaryData : /9j/4AAQSkZJRgABAQAAAQABAAD/2wBDAAMCAgMCAgMDAwMEAwMEBQgFBQQEBQoHBwYIDAoMDAsKCwsNDhIQDQ..
     * DistFacePicUrl : http://10.21.22.115:6120/pic?7dd43=sb6-z67194163f7=11i5m*epdt=*4pdi=*1s=i1b4i6d03*918a05cf2-88d032--6733588i273*e7ic5=
     */

    @JsonProperty("SrcFacePicBinaryData")
    private String SrcFacePicID;
    @JsonProperty("SrcFacePicUrl")
    private String SrcFacePicUrl;
    @JsonProperty("DistFacePicBinaryData")
    private String DistFacePicBinaryData;
    @JsonProperty("DistFacePicUrl")
    private String DistFacePicUrl;
}
