package com.example.exceptions.handler;

import com.example.exceptions.InvalidConfigException;
import com.example.exceptions.InvalidMonitorException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlers {

  @ExceptionHandler(InvalidMonitorException.class)
  protected ResponseEntity<String> handlerInvalidMonitorException(InvalidMonitorException err) {
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err.getMessage());
  }

  @ExceptionHandler(InvalidConfigException.class)
  protected ResponseEntity<String> handlerInvalidConfigException(InvalidConfigException err) {
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err.getMessage());
  }

}
