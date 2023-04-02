package ru.pulkras.application.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;
import lombok.extern.log4j.Log4j2;
import lombok.SneakyThrows;

@Log4j2
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Component
public class EmailClientApi {

    public void sendEmail(String destinationEmail, String message) throws InterruptedException {
        // send
        Thread.sleep(1000L);
        log.info(String.format("Email to %s succesfully sent", destinationEmail));
    }
}
