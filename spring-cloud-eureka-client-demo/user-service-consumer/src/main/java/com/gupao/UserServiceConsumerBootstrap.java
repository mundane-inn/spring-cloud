package com.gupao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import static javafx.scene.input.KeyCode.R;

@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceConsumerBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceConsumerBootstrap.class);
    }


    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
