package com.imooc.product.exception;

import com.imooc.product.enums.ResultEnum;

/**
 * Created by ZHL on 2018/11/10.
 */
public class ProductException extends RuntimeException {

    private Integer code;

    public ProductException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
