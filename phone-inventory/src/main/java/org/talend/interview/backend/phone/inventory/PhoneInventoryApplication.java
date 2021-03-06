package org.talend.interview.backend.phone.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableAutoConfiguration
@EnableFeignClients
public class PhoneInventoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhoneInventoryApplication.class, args);
    }


}
