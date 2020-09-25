package com.twuc.shopping.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * @author Boyu Yuan
 * @date 2020/9/25 14:35
 */
@Table(name = "order_list")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
public class Order {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private BigDecimal price;
    private int number;
    private String unit;
    private int productId;

    public Order(String name, BigDecimal price, int number, String unit, int productId) {
        this.name = name;
        this.price = price;
        this.number = number;
        this.unit = unit;
        this.productId = productId;
    }
}
