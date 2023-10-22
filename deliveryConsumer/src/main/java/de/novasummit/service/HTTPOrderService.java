package de.novasummit.service;

import de.novasummit.domain.OrderResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;


@Service
public class HTTPOrderService implements OrderService {

    @Override
    public OrderResponse getOrder(int id) {

        WebClient client = WebClient.builder().baseUrl("http://localhost:8080").build();
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builder(WebClientAdapter.forClient(client)).build();

        OrderHttpClient orderClient = factory.createClient(OrderHttpClient.class);
        return orderClient.getOrder(id + "");
    }
}
