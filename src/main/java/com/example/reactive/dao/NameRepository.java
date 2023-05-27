package com.example.reactive.dao;

import com.example.reactive.entity.NameBasics;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface NameRepository extends ReactiveCrudRepository<NameBasics, String> {

    Mono<NameBasics> findByPrimaryName(String primaryName);

}
