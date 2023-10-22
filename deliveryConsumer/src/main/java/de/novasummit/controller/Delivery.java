package de.novasummit.controller;

import de.novasummit.domain.DeliveryResponse;
import de.novasummit.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Delivery {
    @Autowired
    private DeliveryService deliveryService;
    @GetMapping("/deliver")
    public DeliveryResponse deliver(){
        var delivered = deliveryService.deliver();
        var response = new DeliveryResponse();
        response.setDelivered(delivered);
        return response;
    }
}
