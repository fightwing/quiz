package com.twuc.shopping.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Boyu Yuan
 * @date 2020/9/25 14:09
 */
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
public class Product {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int price;
    private String unit;
    private String url;

}
