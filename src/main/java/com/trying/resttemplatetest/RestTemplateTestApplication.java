package com.trying.resttemplatetest;

import com.trying.resttemplatetest.services.RequestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Slf4j
@SpringBootApplication
@ComponentScan(basePackages = {"com.trying.resttemplatetest.services*", "com.trying.resttemplatetest.config","com.trying.resttemplatetest.controllers*"})
@EntityScan()

public class RestTemplateTestApplication  {


    public static void main(String[] args) {
        SpringApplication.run(RestTemplateTestApplication.class, args);

    }

}
