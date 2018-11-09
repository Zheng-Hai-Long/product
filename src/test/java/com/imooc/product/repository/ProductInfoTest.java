package com.imooc.product.repository;

import com.imooc.product.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by ZHL on 2018/11/9.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoTest {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void testFindByProductStatus() throws Exception {

        List<ProductInfo> list = productInfoRepository.findByProductStatus(0);

        Assert.assertTrue(list.size() > 0);

    }
}