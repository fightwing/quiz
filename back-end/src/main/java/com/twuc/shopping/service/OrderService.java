package com.twuc.shopping.service;

import com.twuc.shopping.po.Order;
import com.twuc.shopping.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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



    public List<Order> getOrders(){
       return orderRepository.findAll();
    }

    public void deleteOrder(int id){
        orderRepository.deleteById(id);
    }
}
