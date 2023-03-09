package com.portal.centro.API.handler.advice;

import com.portal.centro.API.handler.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
class RestExceptionHandler {

    @ExceptionHandler(ResourceNotFound.class)
    public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFound ex){

        ErrorMessage error = new ErrorMessage("Not Found");

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ErrorMessage.class)
    public ResponseEntity<?> handleResourceCustomErrorException(String exception){

        ErrorMessage error = new ErrorMessage(exception); //Personalized Message

        return new ResponseEntity<>(error, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(ObjectInvalidException.class)
    public ResponseEntity<?> handleUserConflict(ObjectInvalidException exception){
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(UserNotFound.class)
    public ResponseEntity<?> handleUserNotFound(UserNotFound exception){
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ObjectInsertionConflictException.class)
    public ResponseEntity<?> handleUserNotFound(ObjectInsertionConflictException exception){
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.CONFLICT);
    }
}