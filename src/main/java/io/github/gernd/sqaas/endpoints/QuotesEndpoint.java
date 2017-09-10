package io.github.gernd.sqaas.endpoints;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuotesEndpoint {

    @GetMapping(path = "/quotes")
    public ResponseEntity<String> getAllQuotes(){
       return ResponseEntity.ok("All quotes");
    }

}
