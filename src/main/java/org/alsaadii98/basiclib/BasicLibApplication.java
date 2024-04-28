package org.alsaadii98.basiclib;

import org.alsaadii98.basiclib.util.HelloUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicLibApplication {

    private static HelloUtil helloUtil;

    @Autowired // Constructor injection
    public BasicLibApplication(HelloUtil helloUtil) {
        BasicLibApplication.helloUtil = helloUtil;
    }

    public static void main(String[] args) {
        SpringApplication.run(BasicLibApplication.class, args);
    }

}
