package de.novasummit.service;

import de.novasummit.domain.OrderResponse;
import de.novasummit.entity.Deliverable;
import de.novasummit.repository.DeliverableRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Getter @Setter
public class ExpressDeliveryService implements DeliveryService{
    private static double MAX_PRICE = 15.0d;
    @Autowired
    private DeliverableRepository deliverableRepository;
    @Autowired
    private OrderService orderService;
    @Override
    public boolean deliver() {
        try{
            double total = deliverableRepository.findAll()
                    .stream()
                    .map(Deliverable::getProductId)
                    .map((o) -> orderService.getOrder(o.intValue()))
                    .map(OrderResponse::getPrice)
                    .reduce(0.0d, Double::sum);
            return total <= MAX_PRICE;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}

