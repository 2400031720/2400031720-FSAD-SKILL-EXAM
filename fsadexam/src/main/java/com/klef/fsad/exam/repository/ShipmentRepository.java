package com.klef.fsad.exam.repository;

import com.klef.fsad.exam.model.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentRepository extends JpaRepository<Shipment, Integer> {
}