package de.novasummit.service;

import de.novasummit.domain.OrderResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;


public interface OrderHttpClient {
    @GetExchange("/order/{id}")
    OrderResponse getOrder(@PathVariable String id);
}

