package com.hdhye.toyproject.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@ComponentScan("com.hdhye.toyproject")
@SpringBootApplication(scanBasePackages = "com.hdhye.toyproject")
public class ToyProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToyProjectApplication.class, args);
    }

}
