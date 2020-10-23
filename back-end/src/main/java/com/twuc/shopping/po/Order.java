package com.twuc.shopping.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

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
    @OneToMany(mappedBy = "order",cascade = CascadeType.ALL)
    private List<OrderInfo> orderInfoList;
    private int totalPrice;

}
