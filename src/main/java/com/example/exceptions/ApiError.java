package com.example.exceptions;

public class ApiError {

  private String error;

  private String message;

  private Integer status;

  public ApiError() {}

  public ApiError(final String error, final String message, final Integer status) {
    this.error = error;
    this.message = message;
    this.status = status;
  }

  public String getError() {
    return this.error;
  }

  public void setError(final String error) {
    this.error = error;
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(final String message) {
    this.message = message;
  }

  public Integer getStatus() {
    return this.status;
  }

  public void setStatus(final Integer status) {
    this.status = status;
  }
}
