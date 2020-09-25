package com.twuc.shopping.controller;

import com.twuc.shopping.po.Product;
import com.twuc.shopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author Boyu Yuan
 * @date 2020/9/25 15:36
 */
@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/product")
    public ResponseEntity addProduct(@RequestBody Product product){
       Boolean flag = productService.addProduct(product);
       if (flag == true){
           return ResponseEntity.ok("添加成功");
       }else {
           return ResponseEntity.badRequest().body("添加失败");
       }
    }
}
