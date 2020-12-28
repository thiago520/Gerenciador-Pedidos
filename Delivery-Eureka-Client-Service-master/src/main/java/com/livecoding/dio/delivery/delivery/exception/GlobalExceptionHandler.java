package com.livecoding.dio.delivery.delivery.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(com.livecoding.dio.delivery.delivery.exception.ResourceNotFoundException.class)
  public ResponseEntity<?> resourceNotFoundException(com.livecoding.dio.delivery.delivery.exception.ResourceNotFoundException ex, WebRequest request) {
    com.livecoding.dio.delivery.delivery.exception.ErrorDetails errorDetails = new com.livecoding.dio.delivery.delivery.exception.ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
    return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
  }

  @ExceptionHandler(Exception.class)
  public ResponseEntity<?> globleExcpetionHandler(Exception ex, WebRequest request) {
    com.livecoding.dio.delivery.delivery.exception.ErrorDetails errorDetails = new com.livecoding.dio.delivery.delivery.exception.ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
    return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
  }


}

