package com.example.reactive.dao;

import com.example.reactive.entity.NameBasics;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NameRepository extends ReactiveCrudRepository<NameBasics, String> {


}
