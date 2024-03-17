package org.coderic.dian.gateway.controllers;

//import org.coderic.dian.gateway.clients.CountryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class IndexController {
    @Autowired
//    CountryClient countryClient;

    @GetMapping("/")
    public ResponseEntity<String> getIndex() {
        return new ResponseEntity<String>("OK", HttpStatus.OK);
    }
}
