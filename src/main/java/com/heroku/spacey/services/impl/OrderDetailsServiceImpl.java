package com.heroku.spacey.services.impl;

import com.heroku.spacey.dao.OrderDetailsDao;
import com.heroku.spacey.dto.order.OrderDetailsDto;
import com.heroku.spacey.dto.order.OrderStatusDto;
import com.heroku.spacey.services.OrderDetailsService;
import com.heroku.spacey.utils.security.SecurityUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

@Service
@RequiredArgsConstructor
public class OrderDetailsServiceImpl implements OrderDetailsService {

    private final OrderDetailsDao orderDetailsDao;
    private final SecurityUtils securityUtils;

    @Override
    public OrderDetailsDto getOrderDetails(Long orderId) throws SQLException {
        return orderDetailsDao.getOrderDetails(orderId, securityUtils.getUserIdByToken());
    }

    @Override
    @Transactional
    public void updateOrderStatus(OrderStatusDto orderStatusDto) {
        orderDetailsDao.updateOrderStatus(orderStatusDto);
    }

    @Override
    @Transactional
    public void setDeliveredStatus(Long orderId) {
        orderDetailsDao.setDeliveredStatus(orderId);
    }

    @Override
    @Transactional
    public void setFailStatus(Long orderId) {
        orderDetailsDao.setFailStatus(orderId);
    }
}
