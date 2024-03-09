package com.example.logback.MRest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

/**
 * Created by taraneh on 7/17/2020.
 */
@RestController
@RequestMapping("/server")
public class MyRest implements Serializable{


    Logger logger = LoggerFactory.getLogger(MyRest.class);

    @PostMapping("/register")
    public String Register(@RequestBody MyBody  myBody){
        logger.info(".......myBody is {}", myBody.toString());
        return "true";
    }

}
