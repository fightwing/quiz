package com.twuc.shopping.repository;

import com.twuc.shopping.po.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Boyu Yuan
 * @date 2020/9/25 15:25
 */
public interface ProductRepository extends CrudRepository<Product,Integer> {
}
