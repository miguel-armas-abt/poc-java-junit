package com.demo.poc.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FieldValidator {

  private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
  private static final String CELLPHONE_NUMBER_REGEX = "^9\\d{8}$";

  public static boolean isValidEmail(String email) {
    return email != null && email.matches(EMAIL_REGEX);
  }

  public static boolean isValidCellphoneNumber(String cellphoneNumber) {
    return cellphoneNumber.matches(CELLPHONE_NUMBER_REGEX);
  }
}
