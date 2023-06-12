package com.example.depedencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service
public class EnvironmentServiceImQA implements EnvironmentService {
    @Override
    public String getEnv() {
        return "qa";
    }
}
