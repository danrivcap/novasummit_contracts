package de.novasummit.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="orders")
@Data
public class OrderEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String product;

    private double price;

}
