package com.addressFinder.domain.service;

import com.addressFinder.api.model.response.AddressExternalResponse;
import com.addressFinder.core.mapper.AddressMapper;
import com.addressFinder.infrastructure.feign.AddressFeign;
import com.addressFinder.infrastructure.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressService {

    private final AddressFeign addressFeign;
    private final AddressRepository addressRepository;

    public AddressExternalResponse findAddressByZipCode(String zipCode) {
        AddressExternalResponse addressByZip = addressFeign.findAddressByZip();
        addressRepository.save(AddressMapper.toEntity(addressByZip));
        return addressByZip;
    }


}
