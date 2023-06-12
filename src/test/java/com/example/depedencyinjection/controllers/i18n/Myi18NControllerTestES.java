package com.example.depedencyinjection.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// Uses the default ( EN ) profile if commented out.
//@ActiveProfiles("ES")
@SpringBootTest
class Myi18NControllerTestES {

    @Autowired
    Myi18NController myi18NController;
    @Test
    void sayHello() {
        System.out.println(myi18NController.sayHello());
    }
}