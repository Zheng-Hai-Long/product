package com.imooc.product.service;

import com.imooc.product.dataobject.ProductInfo;
import com.imooc.product.dto.CartDTO;

import java.util.List;

/**
 * Created by ZHL on 2018/11/9.
 */
public interface ProductService {

    /**
     * 查询在架商品
     * @return
     */
    List<ProductInfo> findProductAll();

    List<ProductInfo> findList(List<String> productIdList);

    void decreaseStock(List<CartDTO> cartDTOList);
}
