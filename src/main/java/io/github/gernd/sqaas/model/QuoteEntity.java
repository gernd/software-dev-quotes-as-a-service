package io.github.gernd.sqaas.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class QuoteEntity {

    @Id
    @GeneratedValue
    private long Id;

    private String quote;
    private String author;
}
