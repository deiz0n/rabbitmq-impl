package com.deiz0n.controller.services;

import com.deiz0n.controller.domain.dtos.MessageDTO;
import com.deiz0n.controller.domain.events.EmailSent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    final ApplicationEventPublisher eventPublisher;

    public EmailServiceImpl(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    @Override
    public void sendEmail(MessageDTO messageDTO) {
        var emailSent = new EmailSent(this, messageDTO);
        eventPublisher.publishEvent(emailSent);
    }
}
