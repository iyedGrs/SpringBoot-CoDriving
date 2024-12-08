package org.example.projetj2e;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class ProjetJ2EApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetJ2EApplication.class, args);
    }

}
