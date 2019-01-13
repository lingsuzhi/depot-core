package com.lsz.core.common;


import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * 分页参数
 *
 */
@Data
public class PageParam<T> {

    //当前页码
    @Min(1)
    private int pageSize;

    //每页数，最大100
    @Min(1)
    @Max(100)
    private int pageNum;

    private PageOrderType order;

    private String sort;

    private T query;

    public enum PageOrderType {

        /**
         * 升序
         */
        ASC,

        /**
         * 降序
         */
        DESC
    }
}
