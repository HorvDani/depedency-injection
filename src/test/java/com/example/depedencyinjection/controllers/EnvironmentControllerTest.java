package com.example.depedencyinjection.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;
@ActiveProfiles({"prod", "EN"})  // Need 2 profiles, since we have 2 default profiles otherwise it will crash
@SpringBootTest
class EnvironmentControllerTest {

    @Autowired
    EnvironmentController controller;
    @Test
    void getEnvironment() {
        System.out.println(controller.getEnvironment());
    }
}