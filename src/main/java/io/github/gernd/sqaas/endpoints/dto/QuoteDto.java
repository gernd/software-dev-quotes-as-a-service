package io.github.gernd.sqaas.endpoints.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class QuoteDto {
    private String quote;
    private String author;
}
