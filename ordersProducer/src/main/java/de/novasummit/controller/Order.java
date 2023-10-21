package de.novasummit.controller;

import de.novasummit.domain.OrderResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Order {

    @GetMapping("/order/{id}")
    @ResponseBody
    public OrderResponse getOrders(@PathVariable String id){

        OrderResponse order = new OrderResponse();
        order.setId(Integer.parseInt(id));
        order.setProduct("Product 1");
        return order;
    }
}
