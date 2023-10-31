package io.getarrays.server.service;

import io.getarrays.server.model.Server;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

@Service
@Transactional
public interface ServerService {

    Server create(Server server);

    Collection<Server> list(int limit);

    Server get(Long id);

    Server update(Server server);

    Server delete(Long id);
}
