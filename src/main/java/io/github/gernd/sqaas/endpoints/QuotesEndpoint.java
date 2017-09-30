package io.github.gernd.sqaas.endpoints;

import io.github.gernd.sqaas.endpoints.dto.QuoteDto;
import io.github.gernd.sqaas.model.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
public class QuotesEndpoint {

    @Autowired
    private QuoteRepository quoteRepository;

    @GetMapping(path = "/quotes")
    @Transactional
    public ResponseEntity<List<QuoteDto>> getAllQuotes() {
        List<QuoteDto> quotes = quoteRepository
                .streamQuotes()
                .map(q -> QuoteDto.builder().quote(q.getQuote()).author(q.getAuthor()).build())
                .collect(Collectors.toList());

        return ResponseEntity.ok(quotes);
    }
}
