package ru.pulkras.application.controllers.errors;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.pulkras.application.service.EmailClientApi;
import ru.pulkras.application.store.dao.SendEmailTaskDao;
import ru.pulkras.application.store.enteties.SendEmailTaskEntity;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal =  true)
@RestController
public class EmailController {

    SendEmailTaskDao sendEmailTaskDao;
    EmailClientApi emailClientApi;
    public static final String SEND_EMAIL = "/api/email/send";



    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PostMapping(SEND_EMAIL)
    public void sendEmail(@RequestParam("destination_email") String destinationEmail,
                          @RequestParam String message) throws InterruptedException {

        sendEmailTaskDao.save(
                SendEmailTaskEntity.builder()
                        .destinationEmail(destinationEmail)
                        .message(message)
                        .build()
        );
//        emailClientApi.sendEmail(destinationEmail, message);
    }
}
