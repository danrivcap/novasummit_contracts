package de.novasummit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Deliverable {

    @Id
    @GeneratedValue
    private Long id;

    private Long productId;


}
