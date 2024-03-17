package org.coderic.dian.gateway.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("webhooks")
public class WebhooksController {
    @GetMapping("/greeting")
    public ResponseEntity<String> getGreeting() {
        String result = "Test";
        return new ResponseEntity<String>(result, HttpStatus.OK);
    }
}
