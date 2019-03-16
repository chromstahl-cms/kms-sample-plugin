package de.fredlahde;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/foo")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("hello world");
    }
}
