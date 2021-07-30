package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.SetterInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectionControllerTest {

    SetterInjectionController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectionController();
        controller.setGreetingService(new SetterInjectedGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}