package com.twuc.shopping.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author Boyu Yuan
 * @date 2020/10/23 11:55
 */

@Table(name = "order_info_list")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
public class OrderInfo {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private BigDecimal price;
    private int number;
    @ManyToOne
    @JoinColumn(name = "order_list_id")
    private Order order;
}
