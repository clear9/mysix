package com.cn.mi.entity.param.jielink;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


/**
 * created on 2021-01-20 15:03
 *
 * @author wub
 */

@NoArgsConstructor
@Data
public class JieLinkList {

    private Integer pageIndex;
    private Integer pageSize;
    private Integer pageCount;
    private Integer totalCount;
    private List<InsetJieLinkWhiteParam> blackWhiteList;

}
