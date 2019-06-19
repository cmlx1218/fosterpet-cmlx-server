package com.fosterpet.cmlx.fosterpetconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableConfigServer
public class FosterpetConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(FosterpetConfigApplication.class, args);
    }

}
