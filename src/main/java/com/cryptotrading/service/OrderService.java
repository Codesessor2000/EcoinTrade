package com.cryptotrading.service;

import com.cryptotrading.domain.OrderType;
import com.cryptotrading.modal.Coin;
import com.cryptotrading.modal.Order;
import com.cryptotrading.modal.OrderItem;
import com.cryptotrading.modal.User;

import java.util.List;

public interface OrderService {
    Order createOrder(User user, OrderItem orderItem, OrderType orderType);
    Order getOrderById(Long orderId) throws Exception;
    List<Order> getAllrdersOfUser(Long userId, OrderType orderType, String assetSymbol);
    Order processOrder(Coin coin, double quantity, OrderType orderType, User user) throws Exception;
}
