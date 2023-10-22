package de.novasummit.controller;

import de.novasummit.domain.OrderResponse;
import de.novasummit.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class Order {
    @Autowired
    private OrderService orderService;
    @GetMapping("/order/{id}")
    @ResponseBody
    public OrderResponse getOrder(@PathVariable String id){
        return orderService.getOrderById(Integer.parseInt(id));
    }
}
