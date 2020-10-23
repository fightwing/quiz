package com.twuc.shopping.controller;

import com.twuc.shopping.po.Order;
import com.twuc.shopping.service.OrderService;
import com.twuc.shopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Boyu Yuan
 * @date 2020/9/25 16:19
 */

@RestController
public class OrderController {

    @Autowired
    ProductService productService;
    @Autowired
    OrderService orderService;

//    @PostMapping("/order")
//    public ResponseEntity addOrder(@RequestBody Order order){
//        if (orderService.findOrderByProductId(order)){
//            orderService.updateOrder(order);
//        }else {
//            orderService.addOrderFirstTime(order);
//        }
//        return ResponseEntity.ok("成功加入订单");
//    }

    @GetMapping("/orders")
    public ResponseEntity getOrders(){
        return ResponseEntity.ok(orderService.getOrders());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteOrder(@PathVariable int id){
        orderService.deleteOrder(id);
        return ResponseEntity.ok("删除成功");
    }
}
