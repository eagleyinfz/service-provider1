package com.accenture.micropaas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableHystrix
@EnableCircuitBreaker
@EnableDiscoveryClient
@EnableTurbine
public class RestProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestProducerApplication.class, args);
    }
}