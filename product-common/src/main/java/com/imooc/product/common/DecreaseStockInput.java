package com.imooc.product.common;

import lombok.Data;

@Data
public class DecreaseStockInput {
    /**
     * 商品的id
     */
    private String productId;

    /**
     * 商品的数量
     */
    private Integer productQuantuty;

    public DecreaseStockInput() {
    }

    public DecreaseStockInput(String productId, Integer productQuantuty) {
        this.productId = productId;
        this.productQuantuty = productQuantuty;
    }
}
