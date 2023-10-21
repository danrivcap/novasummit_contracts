package de.novasummit.service;

import de.novasummit.domain.OrderResponse;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BasicHttpOrderService implements OrderService {


    Map<Integer,OrderResponse> orderRepository;

    public BasicHttpOrderService(){
        OrderResponse order1 = new OrderResponse(1, "Apples", 10.15);
        OrderResponse order2 = new OrderResponse(2, "Oranges", 15.25);
        OrderResponse order3 = new OrderResponse(3, "Bananas", 10.35);
        orderRepository = Map.of(order1.getId(),order1,order2.getId(),order2,order3.getId(),order3);
    }

    @Override
    public OrderResponse getOrderById(Integer id) {


        return orderRepository.get(id);
    }
}
