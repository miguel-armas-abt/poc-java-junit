package com.demo.poc.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FieldValidatorTest {

  @ParameterizedTest
  @CsvSource({
      "elon.musk@email.com, true",
      "mark-zuckerberg@mail.es, true",
      "lines_torvalds@gmail.com, true",
      "default, false"
  })
  @DisplayName("Given email, when valid it, then returns validation flag")
  void givenEmail_WhenValidIt_ThenReturnsValidationFlag(String input, boolean expected) {
    // Arrange

    // Act
    boolean result = FieldValidator.isValidEmail(input);

    // Assert
    assertEquals(expected, result);
  }

  @ParameterizedTest
  @CsvSource({
      "987654321, true",
      "999111333, true",
      "default, false"
  })
  @DisplayName("Given cellphone number, when valid it, then returns validation flag")
  void givenCellphoneNumber_WhenValidIt_ThenReturnsValidationFlag(String input, boolean expected) {
    // Arrange

    // Act
    boolean actual = FieldValidator.isValidCellphoneNumber(input);

    // Assert
    assertEquals(expected, actual);
  }

}