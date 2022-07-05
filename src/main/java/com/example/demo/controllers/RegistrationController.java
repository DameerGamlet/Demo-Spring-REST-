package com.example.demo.controllers;

import com.example.demo.services.registration.RegistrationRequest;
import com.example.demo.services.registration.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;

    @PostMapping()
    public String register(@RequestBody RegistrationRequest registrationRequest){
        return registrationService.register(registrationRequest);
    }

    @GetMapping(path = "confirmed")
    public String confirm(@RequestParam("token") String token){
        return registrationService.confirmToken(token);
    }
}
