package ru.pulkras.application.controllers.errors;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal =  true)
@RestController
public class Controller {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello world";
    }
}
