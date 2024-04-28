package org.alsaadii98.basiclib.util;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component
public class HelloUtil {
    public String sayHello() {
        return "Hello, World";
    }
}
