package org.coderic.bank.gateway.controllers;

import org.coderic.bank.gateway.clients.CountryClient;
import org.coderic.bank.wsdl.GetCountryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class IndexController {
    @Autowired
    CountryClient countryClient;
    @GetMapping("/")
    public ResponseEntity<String> getIndex() {
        String country = "Spain";
        GetCountryResponse response = countryClient.getCountry(country);
        String result = response.getCountry().getCurrency().value();
        return new ResponseEntity<String>(result, HttpStatus.OK);
    }
}
