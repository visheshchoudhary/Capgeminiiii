package com.example.mobile.controller;


import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.example.mobile.dto.MobileDTO;
import com.example.mobile.entity.Mobile;
import com.example.mobile.service.MobileService;

import java.util.List;

@RestController
@RequestMapping("/api/mobiles")
public class MobileController {

    @Autowired
    private MobileService service;

    // Add Mobile
    @PostMapping
    public ResponseEntity<Mobile> addMobile(@Valid @RequestBody MobileDTO dto) {
        Mobile mobile = service.addMobile(dto);
        return new ResponseEntity<>(mobile, HttpStatus.CREATED);
    }

    // Get All Mobiles
    @GetMapping
    public ResponseEntity<List<Mobile>> getAllMobiles() {
        return ResponseEntity.ok(service.getAllMobiles());
    }

    // Get By Id
    @GetMapping("/{id}")
    public ResponseEntity<Mobile> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getMobileById(id));
    }

    // Update
    @PutMapping("/{id}")
    public ResponseEntity<Mobile> updateMobile(
            @PathVariable Long id,
            @Valid @RequestBody MobileDTO dto) {

        return ResponseEntity.ok(service.updateMobile(id, dto));
    }

    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMobile(@PathVariable Long id) {
        service.deleteMobile(id);
        return ResponseEntity.ok("Mobile deleted successfully!");
    }

    // Search By Brand
    @GetMapping("/search")
    public ResponseEntity<List<Mobile>> searchByBrand(
            @RequestParam String brandName) {

        return ResponseEntity.ok(service.searchByBrand(brandName));
    }
}