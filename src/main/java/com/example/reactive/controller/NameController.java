package com.example.reactive.controller;

import com.example.reactive.dao.NameRepository;
import com.example.reactive.entity.NameBasics;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.concurrent.Delayed;

@RestController
@RequestMapping(path = "api/v1/actors")
@RequiredArgsConstructor
public class NameController {

    private final NameRepository nameRepository;

    @GetMapping("/all")
    public Flux<NameBasics> getAllActors() {
        return nameRepository.findAll()
                .delayElements(Duration.ofSeconds(1))
                .doOnNext(NameBasics -> {
                System.out.println("Fetching : " + NameBasics.getNconst());
        });
    }

    @GetMapping("/byName")
    public Mono<NameBasics> getActorByPrimaryName(@RequestParam String primaryName) {
        return nameRepository.findByPrimaryName(primaryName);
    }

}
