package com.kaciry.own;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@MapperScan("com.kaciry.own.dao")
@ComponentScan("com.kaciry")
public class KaciryApplication {

    public static void main(String[] args) {
        SpringApplication.run(KaciryApplication.class, args);
    }

}
