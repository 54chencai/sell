package com.itclub4u.sell.dto;

import com.itclub4u.sell.dataobject.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class OrderDTO {

    /** 订单号. */
    private String orderId;

    /** 买家名字. */
    private String buyerName;

    /** 买家电话. */
    private String buyerPhone;

    /** 买家地址. */
    private String buyerAddress;

    /** 买家openid. */
    private String buyerOpenid;

    /** 订单总额. */
    private BigDecimal orderAmount;

    /** 订单状态,默认为新下单. */
    private Integer orderStatus;

    /** 支付状态,默认为未支付. */
    private Integer payStatus;

    /** 创建时间. */
    private Date createTime;

    /** 更新时间. */
    private Date updateTime;

    /** 商品列表. */
    private List<OrderDetail> orderDetailList;
}
