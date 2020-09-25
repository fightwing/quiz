package com.twuc.shopping.service;

import com.twuc.shopping.po.Order;
import com.twuc.shopping.repository.OrderRepository;
import org.springframework.stereotype.Service;

/**
 * @author Boyu Yuan
 * @date 2020/9/25 16:20
 */
@Service
public class OrderService {
    final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void addOrderFirstTime(Order order){
        orderRepository.save(order);
    }

    public void updateOrder(Order order){
       Order order1 = orderRepository.findByProductId(order.getProductId());
       order1.setNumber(order1.getNumber()+order.getNumber());
       orderRepository.save(order1);
    }

    public Boolean findOrderByProductId(Order order){
        Order order1 = orderRepository.findByProductId(order.getProductId());
        if (order1 != null){
            return true;
        }else {
            return false;
        }
    }
}
