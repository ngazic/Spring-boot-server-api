package com.gaza.server.service;

import com.gaza.server.model.Server;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Collection;

public interface ServerService {
    Server create(Server server);
    Server ping(String ipAddress) throws IOException;
    Collection<Server> list(int limit);
    Server get(String id);
    Server update(Server server);
    Boolean delete(String id);
}
