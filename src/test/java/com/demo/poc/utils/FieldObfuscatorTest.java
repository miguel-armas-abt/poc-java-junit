package com.demo.poc.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FieldObfuscatorTest {

  @ParameterizedTest
  @CsvSource({
      "myPassword, myP***ord",
      "elon.musk@email.com, elo***com",
  })
  @DisplayName("Given sensitive value, when obfuscate it, then returns obfuscated value")
  void givenEmail_WhenValidEmail_ThenReturnsValidationFlag(String input, String expected) {
    // Arrange

    // Act
    String actual = FieldObfuscator.partiallyObfuscate(input);

    // Assert
    assertEquals(expected, actual);
  }

}