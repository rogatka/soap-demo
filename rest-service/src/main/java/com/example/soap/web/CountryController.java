package com.example.soap.web;

import com.example.soap.client.GetCountryResponse;
import com.example.soap.service.CountryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping
    public ResponseEntity<GetCountryResponse> getCountry(@RequestParam String country) {
        GetCountryResponse response = countryService.getCountry(country);
        return ResponseEntity.ok(response);
    }
}
