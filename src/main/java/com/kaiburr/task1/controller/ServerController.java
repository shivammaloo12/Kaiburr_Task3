package com.kaiburr.task1.controller;

import com.kaiburr.task1.model.Server;
import com.kaiburr.task1.repository.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/servers")
public class ServerController {

    @Autowired
    private ServerRepository serverRepository;

    // Create a new server
    @PostMapping
    public ResponseEntity<Server> createServer(@RequestBody Server server) {
        Server savedServer = serverRepository.save(server);
        return new ResponseEntity<>(savedServer, HttpStatus.CREATED);
    }

    // Get all servers
    @GetMapping
    public ResponseEntity<List<Server>> getAllServers() {

        List<Server> servers = serverRepository.findAll();
        return new ResponseEntity<>(servers, HttpStatus.OK);
    }

    // Get Server by ID
    @GetMapping("/{id}")
    public ResponseEntity<?> getServerById(@PathVariable String id) {
        Optional<Server> server = serverRepository.findById(id);

        // Check if the server exists
        if (server.isPresent()) {
            return new ResponseEntity<>(server.get(), HttpStatus.OK);
        } else {
            // If the server is not found, return a 404 response with a message
            return new ResponseEntity<>("Server not found", HttpStatus.NOT_FOUND);
        }
    }

    // Update a Server by ID
    @PutMapping("/{id}")
    public ResponseEntity<Server> updateServer(@PathVariable String id, @RequestBody Server updatedServer) {
        Optional<Server> existingServer = serverRepository.findById(id);
        if (existingServer.isPresent()) {
            // Update the existing server with the data from updatedServer
            Server serverToUpdate = existingServer.get();
            serverToUpdate.setName(updatedServer.getName());
            serverToUpdate.setLanguage(updatedServer.getLanguage());
            serverToUpdate.setFramework(updatedServer.getFramework());

            Server savedServer = serverRepository.save(serverToUpdate);
            return new ResponseEntity<>(savedServer, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete server by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteServer(@PathVariable String id) {
        serverRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Delete all servers
    @DeleteMapping("/all")
    public ResponseEntity<Void> deleteAllServers() {
        serverRepository.deleteAll();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Find servers by name
    @GetMapping("/findByName")
    public ResponseEntity<List<Server>> findServersByName(@RequestParam String name) {
        List<Server> servers = serverRepository.findByNameContainingIgnoreCase(name);
        return new ResponseEntity<>(servers, HttpStatus.OK);
    }
}
