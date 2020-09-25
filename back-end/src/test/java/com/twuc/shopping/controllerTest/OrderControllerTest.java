package com.twuc.shopping.controllerTest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.twuc.shopping.po.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author Boyu Yuan
 * @date 2020/9/25 16:11
 */
@SpringBootTest
@AutoConfigureMockMvc
public class OrderControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void should_add_Order_succeed() throws Exception {
        BigDecimal p =new BigDecimal("4.00");
        Order order = new Order("Coke",p,2,"瓶",1);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(order);
        mockMvc.perform(post("/order").content(jsonString).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void should_get_Orders() throws Exception {
        mockMvc.perform(get("/orders")).andExpect(status().isOk())
                .andExpect(jsonPath("$",hasSize(1)))
                .andExpect(jsonPath("$[0].id",is(4)))
                .andExpect(jsonPath("$[0].name",is(("Coke"))))
                .andExpect(jsonPath("$[0].price",is(4.00)))
                .andExpect(jsonPath("$[0].unit",is("瓶")))
                .andExpect(jsonPath("$[0].productId",is(1)));
    }

    @Test
    void should_delete_order_by_id() throws Exception {
        mockMvc.perform(delete("/1")).andExpect(status().isOk());
    }
}
