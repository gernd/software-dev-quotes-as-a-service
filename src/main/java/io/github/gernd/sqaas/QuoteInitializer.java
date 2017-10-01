package io.github.gernd.sqaas;

import io.github.gernd.sqaas.model.QuoteEntity;
import io.github.gernd.sqaas.model.QuoteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Initializes all quotes
 */
@Component
@Slf4j
public class QuoteInitializer implements ApplicationRunner {

    @Autowired
    private QuoteRepository quoteRepository;

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {

        List<QuoteEntity> predefinedQuotes = Arrays.asList(
                QuoteEntity.builder().quote("Premature optimzation is the root of all evil").author("Donald Knuth").build(),
                QuoteEntity.builder().quote("YAGNI").author("Unknown").build(),
                QuoteEntity.builder().quote("Untested code does not exist").author("Unknown").build()
        );

        predefinedQuotes.forEach(q -> log.info("Adding quote {} by {}", q.getQuote(), q.getAuthor()));
        quoteRepository.save(predefinedQuotes);
    }
}
