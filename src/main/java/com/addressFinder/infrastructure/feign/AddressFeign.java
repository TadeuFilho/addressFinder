package com.addressFinder.infrastructure.feign;

import com.addressFinder.api.model.response.AddressExternalResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "${feign.client.address.integration.name}",
             url =  "${feign.client.address.integration.url}",
             configuration = FeignConfiguration.class)
public interface AddressFeign {

    @GetMapping("mockTest")
    AddressExternalResponse findAddressByZip();
}
