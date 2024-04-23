package com.logging.demo.controllers;

import com.logging.demo.services.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private Service service;

    private Logger logger = LoggerFactory.getLogger(Controller.class);

    @GetMapping("/")
    public ResponseEntity<String> welcomeMessage(){
        logger.info("Starting welcome message API");
        return ResponseEntity.ok("welcome");
    }
    @GetMapping("/exp")
    public ResponseEntity<Double> exponent(){
        logger.info("Starting exponent API");
        return ResponseEntity.ok(service.exponent());
    }
    @GetMapping("/get-errors")
    public ResponseEntity<?> customError() throws Exception {
        logger.error("Starting customError API");
        throw new Exception("custom Exception");
    }
}
