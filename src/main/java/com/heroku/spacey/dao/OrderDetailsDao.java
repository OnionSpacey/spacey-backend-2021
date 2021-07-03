package com.heroku.spacey.dao;

import com.heroku.spacey.dto.order.OrderDetailsDto;
import com.heroku.spacey.dto.order.OrderStatusDto;

import java.sql.SQLException;

public interface OrderDetailsDao {
    OrderDetailsDto getOrderDetails(Long orderId, Long userId) throws SQLException;

    void updateOrderStatus(OrderStatusDto orderStatusDto);

    void setDeliveredStatus(Long orderId);

    void setFailStatus(Long orderId);
}
