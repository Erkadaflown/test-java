package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DemoApplication {

    @GetMapping("/")
    public String sayHello() {
        return "Student Name: Erkhemkhuu<br>Student Code: B211910803";
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}