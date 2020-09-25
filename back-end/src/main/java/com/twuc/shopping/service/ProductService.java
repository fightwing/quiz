package com.twuc.shopping.service;

import com.twuc.shopping.po.Product;
import com.twuc.shopping.repository.ProductRepository;
import org.springframework.stereotype.Service;

/**
 * @author Boyu Yuan
 * @date 2020/9/25 15:37
 */
@Service
public class ProductService {
    final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Boolean addProduct(Product product){
        productRepository.save(product);
        return true;
    }
}
