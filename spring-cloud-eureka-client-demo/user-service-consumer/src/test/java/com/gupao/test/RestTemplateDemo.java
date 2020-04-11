package com.gupao.test;

import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

public class RestTemplateDemo {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory());
        /*Map<String, Object> data = restTemplate.getForObject("http://localhost:8080/env", Map.class);
        System.out.println("data = " + data);*/
        System.out.println(restTemplate.getForObject("http://localhost:8080/env", Map.class));

    }

}
