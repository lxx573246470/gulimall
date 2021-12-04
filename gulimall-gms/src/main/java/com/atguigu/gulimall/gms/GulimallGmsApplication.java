package com.atguigu.gulimall.gms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GulimallGmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallGmsApplication.class, args);
    }

}
