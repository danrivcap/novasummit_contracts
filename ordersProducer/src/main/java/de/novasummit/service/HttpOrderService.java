package de.novasummit.service;

import de.novasummit.domain.OrderResponse;
import de.novasummit.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class HttpOrderService implements OrderService {

    @Autowired
    OrderRepository orderRepository;



    @Override
    public OrderResponse getOrderById(Integer id) {

        var orderEntity = orderRepository.getReferenceById(Long.valueOf(id));
        var response = new OrderResponse(orderEntity.getId().intValue(),orderEntity.getProduct(),orderEntity.getPrice());

        return response;
    }
}
