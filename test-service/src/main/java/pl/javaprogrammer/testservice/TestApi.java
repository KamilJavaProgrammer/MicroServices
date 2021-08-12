package pl.javaprogrammer.testservice;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {

    @GetMapping("/testapi")
    public ResponseEntity<String> test() {
        return ResponseEntity.status(HttpStatus.OK).body("Hello I'm testApi");
    }
}
