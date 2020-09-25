package com.twuc.shopping.controllerTest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.twuc.shopping.po.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author Boyu Yuan
 * @date 2020/9/25 15:23
 */
@SpringBootTest
@AutoConfigureMockMvc
public class productControllerTest {
    @Autowired
    MockMvc mockMvc;


    @Test
    void should_add_product_succeed() throws Exception {
        BigDecimal p =new BigDecimal("4.00");
        Product product = new Product("Coke",p,"瓶","D:/TWUC-QUIZ/front-end/src/image/Coke.png");
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(product);
        mockMvc.perform(post("/product").content(jsonString).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void should_get_productList() throws Exception {
        mockMvc.perform(get("/products")).andExpect(status().isOk())
                .andExpect(jsonPath("$",hasSize(1)))
                .andExpect(jsonPath("$[0].id",is(1)))
                .andExpect(jsonPath("$[0].name",is(("Coke"))))
                .andExpect(jsonPath("$[0].price",is(4.00)))
                .andExpect(jsonPath("$[0].unit",is("瓶")));
    }
}
