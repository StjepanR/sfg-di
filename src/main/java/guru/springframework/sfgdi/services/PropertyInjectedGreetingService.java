package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

// @Service configured in GreetingServiceConfig
public class PropertyInjectedGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
