package com.davidronaldson.app;

import com.davidronaldson.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(AppConfig.class)
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
