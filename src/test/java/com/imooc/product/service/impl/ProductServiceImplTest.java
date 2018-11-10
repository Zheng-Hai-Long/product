package com.imooc.product.service.impl;

import com.imooc.product.ProductApplicationTests;
import com.imooc.product.dataobject.ProductInfo;
import com.imooc.product.dto.CartDTO;
import com.imooc.product.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
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

    @Test
    public void findList() throws Exception{
        List<ProductInfo> productInfoList = productService.findList(Arrays.asList("157875196366160022", "157875227953464068"));
        Assert.assertTrue(productInfoList.size() > 0);
    }

    @Test
    public void decreaseStock() throws Exception{
        CartDTO cartDTO = new CartDTO("157875196366160022", 2);
        productService.decreaseStock(Arrays.asList(cartDTO));
    }
}