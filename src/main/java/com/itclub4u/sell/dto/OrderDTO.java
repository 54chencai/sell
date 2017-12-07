package com.itclub4u.sell.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.itclub4u.sell.dataobject.OrderDetail;
import com.itclub4u.sell.utils.serializer.Date2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
//@JsonInclude(JsonInclude.Include.NON_NULL)
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
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    /** 更新时间. */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    /** 商品列表. */
    private List<OrderDetail> orderDetailList;
}
