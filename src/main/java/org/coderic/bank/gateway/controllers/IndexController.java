package org.coderic.bank.gateway.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class IndexController {
    @GetMapping("/")
    public ResponseEntity<String> getIndex() {
        String result = "Test";
        return new ResponseEntity<String>(result, HttpStatus.OK);
    }
}
