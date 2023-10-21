package de.novasummit.service;

import de.novasummit.domain.OrderResponse;
import org.springframework.stereotype.Service;


public interface OrderService {

    OrderResponse getOrderById(Integer id);
}
