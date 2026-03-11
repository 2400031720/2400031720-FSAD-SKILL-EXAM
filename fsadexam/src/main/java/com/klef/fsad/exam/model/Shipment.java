package com.klef.fsad.exam.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shipment {

    @Id
    @Column(nullable = false)
    private Integer shipmentId;

    private String name;
    private String date;
    private String status;
    private String origin;
    private String destination;
    private double weight;
}