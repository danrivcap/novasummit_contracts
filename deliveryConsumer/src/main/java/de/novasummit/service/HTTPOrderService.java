package de.novasummit.service;

import de.novasummit.domain.OrderResponse;
import org.springframework.stereotype.Service;

@Service
public class HTTPOrderService implements OrderService {
    @Override
    public OrderResponse getOrder(int id) {
        return null;
    }
}
