package com.example.reactive.dao;

import com.example.reactive.entity.Client;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends ReactiveCrudRepository<Client, Integer> {

//    Mono<Client> findById(Integer id);
//
//    Flux<Client> findByClientName(String clientName);
//
//    Mono<Client> findBySurName(String surName);
//
//    Mono<Client> findByEmail(String email);
}
