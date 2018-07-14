package be.gfi.spring5webapp.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
@Primary
@Slf4j
public class GreetingServiceImpl implements GreetingService {

    @Override
    public void greet() {
        log.info("Hello from {}!", getClass().getSimpleName());
    }
}
