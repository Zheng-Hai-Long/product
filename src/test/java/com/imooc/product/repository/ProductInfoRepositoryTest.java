package com.imooc.product.repository;

import com.imooc.product.ProductApplicationTests;
import com.imooc.product.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ZHL on 2018/11/10.
 */
public class ProductInfoRepositoryTest extends ProductApplicationTests{

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void testFindByProductIdIn() throws Exception {
        List<ProductInfo> productInfoList = productInfoRepository.findByProductIdIn(Arrays.asList("157875196366160022", "157875227953464068"));
        Assert.assertTrue(productInfoList.size() > 0);

    }
}