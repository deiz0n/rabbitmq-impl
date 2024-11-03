package com.deiz0n.controller.controllers;

import com.deiz0n.controller.domain.dtos.MessageDTO;
import com.deiz0n.controller.domain.response.Response;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.context.request.ServletWebRequest;

public interface EmailController {

    @PostMapping("/send")
    ResponseEntity<Response> sendEmail(@RequestBody @Valid MessageDTO request, ServletWebRequest path);

}
