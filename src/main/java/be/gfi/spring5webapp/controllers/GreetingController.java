package be.gfi.spring5webapp.controllers;

import be.gfi.spring5webapp.services.GreetingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
public class GreetingController {

    @Autowired
    @Qualifier("otherGreetingServiceImpl")
    private GreetingService greetingService;

    public void hello() {
        greetingService.greet();
    }
}
