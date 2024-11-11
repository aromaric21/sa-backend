package tech.romaric.sa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.romaric.sa.entites.Sentiment;
import tech.romaric.sa.enums.TypeSentiment;

import java.util.List;

public interface SentimentRepository extends JpaRepository<Sentiment, Integer> {
    List<Sentiment> findByType(TypeSentiment typeSentiment);
}
