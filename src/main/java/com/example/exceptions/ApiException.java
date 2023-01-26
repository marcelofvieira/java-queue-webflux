package com.example.exceptions;

public class ApiException extends RuntimeException {

  private static final long serialVersionUID = 7954487639001126933L;

  private final String code;

  private final String description;

  private final Integer statusCode;

  public ApiException(final String code, final String description, final Integer statusCode) {
    super(description);
    this.code = code;
    this.description = description;
    this.statusCode = statusCode;
  }

  public ApiException(final String code, final String description, final Integer statusCode, final Throwable cause) {
    super(description, cause);
    this.code = code;
    this.description = description;
    this.statusCode = statusCode;
  }

  public String getCode() {
    return this.code;
  }

  public String getDescription() {
    return this.description;
  }

  public Integer getStatusCode() {
    return this.statusCode;
  }
}
