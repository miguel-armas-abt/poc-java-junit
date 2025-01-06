package com.demo.poc.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DateFormatterTest {

  @ParameterizedTest
  @CsvSource({
      "28/04/2025, 28 de abril de 2025",
      "15/08/2023, 15 de agosto de 2023",
      "01/01/2024, 01 de enero de 2024",
      "25/12/2024, 25 de diciembre de 2024"
  })
  @DisplayName("Given valid date, when format date, then returns date description")
  void givenValidDate_WhenFormatDate_ThenReturnsDateDescription(String input, String expected) {
    // Arrange

    // Act
    String actual = DateFormatter.retrieveDateDescription(input);

    // Assert
    assertEquals(expected, actual);
  }
}