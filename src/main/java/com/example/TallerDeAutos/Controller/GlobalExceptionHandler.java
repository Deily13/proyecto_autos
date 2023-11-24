package com.example.TallerDeAutos.Controller;


import jakarta.servlet.http.HttpServletRequest;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

        @ExceptionHandler(Exception.class)
        public ResponseEntity<Object> handleException(Exception ex, HttpServletRequest request) {
            // Handle the error and return an appropriate response
            // (e.g., display an error page)
            return new ResponseEntity<>("Ocurrió un error", HttpStatus.INTERNAL_SERVER_ERROR);
}
    }
