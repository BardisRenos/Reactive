package com.example.reactive.controller;

import com.example.reactive.dao.ClientRepository;
import com.example.reactive.entity.Client;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
@RequestMapping(path = "api/v1/client")
@RequiredArgsConstructor
public class ClientController {

    private final ClientRepository clientRepository;

    @GetMapping("/all")
    public Flux<Client> getAllClients() {
        return clientRepository.findAll().delayElements(Duration.ofSeconds(5))
                .doOnNext(client -> {
                System.out.println("Fetching : " + client.getClientName());
        });
    }
}
