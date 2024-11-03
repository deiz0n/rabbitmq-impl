package com.deiz0n.controller.domain.events;

import com.deiz0n.controller.domain.dtos.MessageDTO;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class EmailSent extends ApplicationEvent {

    final MessageDTO message;

    public EmailSent(Object source, MessageDTO message) {
        super(source);
        this.message = message;
    }
}
