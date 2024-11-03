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
public class Response<T> {

    private HttpStatus status;
    private Integer code;
    private Instant instant;
    private String path;
    private T data;

}
