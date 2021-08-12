package pl.javaprogrammer.test2service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Test2ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Test2ServiceApplication.class, args);
    }

}
