package com.klef.fsad.exam.service;

import com.klef.fsad.exam.model.Shipment;
import com.klef.fsad.exam.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ShipmentService {

    @Autowired
    private ShipmentRepository shipmentRepository;

    public Shipment addShipment(Shipment shipment) {
        return shipmentRepository.save(shipment);
    }

    public Shipment updateShipment(Long id, Shipment shipment) {
        Optional<Shipment> existingShipment = shipmentRepository.findById(id);
        if (existingShipment.isPresent()) {
            shipment.setShipmentId(id);
            return shipmentRepository.save(shipment);
        }
        return null;
    }
}