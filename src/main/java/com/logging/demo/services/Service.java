package com.logging.demo.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@org.springframework.stereotype.Service
public class Service {

    private Logger logger = LoggerFactory.getLogger(Service.class);

    @Value("${var1}")
    private Integer integer1;
    @Value("${var2}")
    private Integer integer2;

    public Double exponent(){
        logger.debug("starting calculation");
        Double result = Math.pow(integer1,integer2);
        logger.debug("starting calculation");
        return result;
    }
}
