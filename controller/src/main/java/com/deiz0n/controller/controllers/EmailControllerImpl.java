package com.deiz0n.controller.controllers;

import com.deiz0n.controller.domain.dtos.MessageDTO;
import com.deiz0n.controller.domain.response.Response;
import com.deiz0n.controller.services.EmailService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.ServletWebRequest;

import java.time.Instant;

@RestController
@RequestMapping("email")
public class EmailControllerImpl implements EmailController {

    final EmailService emailService;

    public EmailControllerImpl(EmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    public ResponseEntity<Response> sendEmail(MessageDTO request, ServletWebRequest path) {
        emailService.sendEmail(request);
        return ResponseEntity.accepted()
                .body(Response.builder()
                        .status(HttpStatus.ACCEPTED)
                        .code(HttpStatus.ACCEPTED.value())
                        .instant(Instant.now())
                        .path(path.getContextPath())
                        .data("Email enviado com sucesso")
                        .build()
                );
    }
}
