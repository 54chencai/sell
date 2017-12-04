package com.itclub4u.sell.service.impl;

import com.itclub4u.sell.dataobject.ProductInfo;
import com.itclub4u.sell.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {

    @Autowired
    private ProductServiceImpl productInfoService;

    @Test
    public void findOne() throws Exception {
        ProductInfo one = productInfoService.findOne("123456");
        Assert.assertEquals("123456",one.getProductId());
    }

    @Test
    public void findUPAll() throws Exception {
        List<ProductInfo> upAll = productInfoService.findUPAll();
        Assert.assertNotEquals(0,upAll.size());
    }

    @Test
    public void findAll() throws Exception {
        Pageable pageable = new PageRequest(0,2);
        Page<ProductInfo> all = productInfoService.findAll(pageable);
        System.out.println(all.getTotalElements());
        Assert.assertNotEquals(0,all.getTotalElements());
    }

    @Test
    public void save() throws Exception {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123457");
        productInfo.setProductName("皮皮虾");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好吃的虾");
        productInfo.setProductIcon("http://xxxx.jpg");
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setCategoryType(2);
        ProductInfo save = productInfoService.save(productInfo);
        Assert.assertNotEquals(null,save);

    }

}