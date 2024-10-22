package com.addressFinder.api.controller;

import com.addressFinder.api.model.response.AddressExternalResponse;
import com.addressFinder.domain.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/address")
public class AddressController {

    private final AddressService addressService;

    @GetMapping("/{zipcode}")
    public ResponseEntity<AddressExternalResponse> getAnAddressByZipCode(@PathVariable String zipcode) {
        return ResponseEntity.ok(addressService.findAddressByZipCode(zipcode));
    }



}