package com.addressFinder.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@AllArgsConstructor
@ToString
@Builder
public class AddressExternalResponse {

    @JsonProperty("cep")
    public String zipcode;

    @JsonProperty("logradouro")
    public String street;

    @JsonProperty("localidade")
    public String city;

    @JsonProperty("uf")
    public String state;


}
