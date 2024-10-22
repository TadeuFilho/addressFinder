package com.addressFinder.core.mapper;

import com.addressFinder.api.model.response.AddressExternalResponse;
import com.addressFinder.domain.entity.Address;

import java.time.LocalDateTime;

public class AddressMapper {

    public static Address toEntity(AddressExternalResponse addressByZip) {
        return Address.builder()
                .city(addressByZip.city)
                .zip(addressByZip.getZipcode())
                .state(addressByZip.getState())
                .street(addressByZip.getStreet())
                .dateTime(LocalDateTime.now())
                .build();
    }

}
