package com.example.soap.client;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

class CountryClientImpl extends WebServiceGatewaySupport implements CountryClient {

    public GetCountryResponse getCountry(String country) {
        GetCountryRequest request = new GetCountryRequest();
        request.setName(country);
        logger.info("Requesting information for " + country);
        return  (GetCountryResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }
}