package com.addressFinder.infrastructure.feign;

import com.addressFinder.core.util.UrlUtils;
import com.addressFinder.domain.exception.AddressNotFoundException;
import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder implements ErrorDecoder {

    private final ErrorDecoder defaultErrorDecoder = new Default();

    @Override
    public Exception decode(String methodKey, Response response) {
        if(response.status() == 400) {
            return new AddressNotFoundException(UrlUtils.extractWrongZipFromUrl(response.request().url()));
        }
        return defaultErrorDecoder.decode(methodKey, response);
    }
}
