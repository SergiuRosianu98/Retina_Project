package com.retina.nypd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NypdApplication {

    public static void main(String[] args) {
        SpringApplication.run(Endpoint.class, args);
    }

}
