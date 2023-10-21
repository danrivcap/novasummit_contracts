package de.novasummit.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.With;

@Data
@AllArgsConstructor
public class OrderResponse {
    private int id;
    private String product;
    private double price;
}
