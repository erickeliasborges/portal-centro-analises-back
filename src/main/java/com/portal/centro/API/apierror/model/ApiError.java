package com.portal.centro.API.apierror.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Map;

@Data
@NoArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class ApiError {
    private LocalDateTime timestamp = LocalDateTime.now();
    private int status;
    private String message;
    private String url;
    private Map<String, String> validationErrors;

    public ApiError(int status, String message, String url,
                    Map<String, String> validationErrors) {
        this.status = status;
        this.message = message;
        this.url = url;
        this.validationErrors = validationErrors;
    }

    public ApiError(int status, String message, String url) {
        this.status = status;
        this.message = message;
        this.url = url;
    }
}
