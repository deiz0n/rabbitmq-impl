package com.deiz0n.controller.domain.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Singular;

import java.util.Map;

public record MessageDTO(
        @NotBlank(message = "O campo \"email\" não pode estar em branco")
        @Email(message = "O campo \"email\" estar inválido")
        @JsonProperty("email_destinatario")
        String emailDestinatario,
        @NotBlank(message = "O campo \"titulo\" não pode estar em branco")
        String titulo,
        @NotBlank(message = "O campo \"conteudo\" não pode estar em branco")
        String conteudo,
        @JsonIgnore
        @Singular("variaveil")
        Map<String, Object> variaveis
) {
}
