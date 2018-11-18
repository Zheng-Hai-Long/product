package com.imooc.product.vo;

import lombok.Data;

/**
 * Created by ZHL on 2018/11/9.
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;
}
