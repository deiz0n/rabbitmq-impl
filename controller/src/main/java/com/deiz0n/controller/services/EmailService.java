package com.deiz0n.controller.services;

import com.deiz0n.controller.domain.dtos.MessageDTO;

public interface EmailService {

    void sendEmail(MessageDTO messageDTO);

}
