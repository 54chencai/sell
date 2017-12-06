package com.itclub4u.sell.converter;

import com.itclub4u.sell.dataobject.OrderMaster;
import com.itclub4u.sell.dto.OrderDTO;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

public class OrderMaster2OrderDTOConverter {

    public static OrderDTO convert(OrderMaster orderMaster) {

        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster, orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasterlist) {

        return orderMasterlist.stream().map(e -> convert(e)).collect(Collectors.toList());
    }
}
