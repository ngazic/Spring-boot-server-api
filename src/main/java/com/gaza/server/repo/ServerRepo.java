package com.gaza.server.repo;

import com.gaza.server.model.Server;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ServerRepo extends MongoRepository<Server, String> {
    Server findByIPAddress(String ipAddress);
 }
