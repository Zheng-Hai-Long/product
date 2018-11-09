package com.imooc.product.service.impl;

import com.imooc.product.ProductApplicationTests;
import com.imooc.product.dataobject.ProductInfo;
import com.imooc.product.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by ZHL on 2018/11/9.
 */
public class ProductServiceImplTest extends ProductApplicationTests{

    @Autowired
    private ProductService productService;

    @Test
    public void testFindProductAll() throws Exception {

        List<ProductInfo> list = productService.findProductAll();
        Assert.assertTrue(list.size() > 0);
    }
}