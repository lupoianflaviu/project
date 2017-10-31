package com.jpard.assetmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Asset Management
 *
 * @author Flaviu Lupoian
 * @version 0.1
 */
@SpringBootApplication
@ComponentScan("com.jpard.assetmanagement")
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

    }
}
