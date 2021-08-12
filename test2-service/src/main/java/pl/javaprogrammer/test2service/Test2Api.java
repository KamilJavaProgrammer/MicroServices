package pl.javaprogrammer.test2service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test2Api {

    @GetMapping("/zull")
    public String test() {
        return "Hello I'm test2Api";
    }
}
