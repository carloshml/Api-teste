package com.example.apiteste.controller; 

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController  
@RequestMapping("/teste") 
public class Controller { 
  
    @GetMapping 
    public ResponseEntity<String> sendHelloWorld() {
        return ResponseEntity.ok("Hello World!");
    }


}