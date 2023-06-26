package com.example.todo;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HealthCheckController {

    @GetMapping("/")
    public ResponseEntity<?> healthCheck(){
        log.info("server is running...I'm healthy");
        return ResponseEntity.ok().body("It's OK!");
    }

}
