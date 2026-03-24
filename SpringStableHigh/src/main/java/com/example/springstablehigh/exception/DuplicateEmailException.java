package com.example.springstablehigh.exception;

import lombok.Getter;

@Getter
public class DuplicateEmailException extends RuntimeException{
  private final String email;

  public DuplicateEmailException(String email) {
    super("이미 사용 중인 이메일입니다: " + email);
    this.email = email;
  }

}
