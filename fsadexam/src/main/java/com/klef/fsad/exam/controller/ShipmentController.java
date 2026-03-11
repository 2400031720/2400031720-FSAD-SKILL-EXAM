package com.klef.fsad.exam.controller;

import com.klef.fsad.exam.model.Shipment;
import com.klef.fsad.exam.service.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/shipments")
public class ShipmentController {

    @Autowired
    private ShipmentService shipmentService;

    @PostMapping
    public ResponseEntity<Shipment> addShipment(@RequestBody Shipment shipment) {
        Shipment savedShipment = shipmentService.addShipment(shipment);
        return ResponseEntity.ok(savedShipment);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Shipment> updateShipment(@PathVariable Long id, @RequestBody Shipment shipment) {
        Shipment updatedShipment = shipmentService.updateShipment(id, shipment);
        if (updatedShipment != null) {
            return ResponseEntity.ok(updatedShipment);
        }
        return ResponseEntity.notFound().build();
    }
}