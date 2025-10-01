package com.inspire.hello.hello;

import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Map<String, Object> hello() {
        Map<String, Object> response = new HashMap<>();
        ZonedDateTime koreaTime = ZonedDateTime.now();
        response.put("koreaTime", koreaTime.toString());
        response.put("timestamp", System.currentTimeMillis());
        response.put("message", "Hello, World!");
        return response;
    }
}

