package io.github.gernd.sqaas.endpoints;

import io.github.gernd.sqaas.endpoints.dto.QuoteDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class QuotesEndpoint {

    @GetMapping(path = "/quotes")
    public ResponseEntity<List<QuoteDto>> getAllQuotes() {

        List<QuoteDto> predefinedQuotes = Arrays.asList(
                QuoteDto.builder().quote("Premature optimzation is the root of all evil").author("Donald Knuth").build(),
                QuoteDto.builder().quote("YAGNI").author("Unknown").build(),
                QuoteDto.builder().quote("Untested code does not exist").author("Unknown").build()
        );
        return ResponseEntity.ok(predefinedQuotes);
    }

}
