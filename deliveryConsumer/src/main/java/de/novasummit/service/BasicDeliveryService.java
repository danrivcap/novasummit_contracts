package de.novasummit.service;

import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Getter @Setter
public class BasicDeliveryService implements DeliveryService{

    private Set<Integer> productRepository;
    
    @Autowired
    OrderService orderService;
    
    private BasicDeliveryService(){
        productRepository = Set.of(1,2,3);
    }
    
    @Override
    public boolean deliver() {

        try {
            for (Integer id:productRepository) {
                orderService.getOrder(id);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }

        return true;
    }
}

