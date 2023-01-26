package com.example.exceptions;

import org.springframework.http.HttpStatus;

public class InvalidMonitorException extends ApiException {

  private static final String BAD_REQUEST_CODE = "bad_request";

  public InvalidMonitorException(final Throwable e) {

    super(
        BAD_REQUEST_CODE,
        HttpStatus.BAD_REQUEST.getReasonPhrase(),
        HttpStatus.BAD_REQUEST.value(),
        e);
  }

  public InvalidMonitorException(final String message, final Throwable e) {
    super(BAD_REQUEST_CODE, message, HttpStatus.BAD_REQUEST.value(), e);
  }

  public InvalidMonitorException(final String message) {
    super(BAD_REQUEST_CODE, message, HttpStatus.BAD_REQUEST.value());
  }
}
