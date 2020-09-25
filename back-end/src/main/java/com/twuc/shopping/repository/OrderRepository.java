package com.twuc.shopping.repository;

import com.twuc.shopping.po.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Boyu Yuan
 * @date 2020/9/25 16:10
 */
public interface OrderRepository extends CrudRepository<Order,Integer> {
    @Override
    List<Order> findAll();

    Order findByProductId(int id);
}
