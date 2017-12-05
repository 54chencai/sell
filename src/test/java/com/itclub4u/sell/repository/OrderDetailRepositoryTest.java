package com.itclub4u.sell.repository;

import com.itclub4u.sell.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest() {
       OrderDetail orderDetail = new OrderDetail();
       orderDetail.setDetailId("123456789");
       orderDetail.setOrderId("111112");
       orderDetail.setProductIcon("http://xxx.jpg");
       orderDetail.setProductId("123456");
       orderDetail.setProductName("皮蛋粥");
       orderDetail.setProductPrice(new BigDecimal(2.3));
       orderDetail.setProductQuantity(52);

        OrderDetail result = repository.save(orderDetail);
        Assert.assertNotEquals(null,result);

    }
    @Test
    public void findByOrderId() throws Exception {
        List<OrderDetail> result = repository.findByOrderId("111112");
        Assert.assertNotEquals(0,result.size());
    }

}