package io.getarrays.server.service.implementation;

import io.getarrays.server.model.Server;
import io.getarrays.server.service.ServerService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

@Service
@Transactional
public class ServerServiceImpl implements ServerService {
    @Override
    public Server create(Server server) {
        return null;
    }

    @Override
    public Server ping(String ipAddress) {
        return null;
    }

    @Override
    public Collection<Server> list(int limit) {
        return null;
    }

    @Override
    public Server get(Long id) {
        return null;
    }

    @Override
    public Server update(Server server) {
        return null;
    }

    @Override
    public Server delete(Long id) {
        return null;
    }
}
