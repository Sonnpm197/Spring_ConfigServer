package com.son.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class LE_ConfigServerMain {
    public static void main(String[] arguments) {
        SpringApplication.run(LE_ConfigServerMain.class, arguments);
    }
}
