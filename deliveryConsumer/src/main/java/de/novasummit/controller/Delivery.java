package de.novasummit.controller;

import de.novasummit.domain.DeliveryResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Delivery {

    @GetMapping("/deliver")
    public DeliveryResponse deliver(){
        var response = new DeliveryResponse();
        response.setDelivered(true);
        return response;
    }
}
