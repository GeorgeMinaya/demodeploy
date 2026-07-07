package com.example.demodeploy;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class RestDemo {

    @GetMapping("/consultar")
    public Map<String, String> consultar() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello World");
        response.put("status", "success");
        response.put("timestamp", String.valueOf(System.currentTimeMillis()));
        return response;
    }
}