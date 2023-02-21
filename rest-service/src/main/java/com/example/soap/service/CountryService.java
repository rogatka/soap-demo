package com.example.soap.service;

import com.example.soap.client.CountryClient;
import com.example.soap.client.GetCountryResponse;
import org.springframework.stereotype.Component;

@Component
public class CountryService {

    private final CountryClient countryClient;

    public CountryService(CountryClient countryClient) {
        this.countryClient = countryClient;
    }

    public GetCountryResponse getCountry(String country) {
        return countryClient.getCountry(country);
    }
}
