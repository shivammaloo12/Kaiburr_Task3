package com.kaiburr.task1.repository;

import com.kaiburr.task1.model.Server;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServerRepository extends MongoRepository<Server, String> {
    List<Server> findByNameContainingIgnoreCase(String name);
}
