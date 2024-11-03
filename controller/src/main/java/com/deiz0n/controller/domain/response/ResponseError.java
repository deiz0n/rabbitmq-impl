package com.deiz0n.controller.domain.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ResponseError {

    private Instant instant;
    private HttpStatus status;
    private String title;
    private String detail;

}
