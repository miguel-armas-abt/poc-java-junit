package com.demo.poc.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DateFormatter {

  private static final String INPUT_DATE_FORMAT = "dd/MM/yyyy";
  private static final String OUTPUT_DATE_FORMAT = "dd 'de' MMMM 'de' yyyy";

  public static String retrieveDateDescription(String date) {
    try {
      SimpleDateFormat inputFormat = new SimpleDateFormat(INPUT_DATE_FORMAT, Locale.getDefault());
      SimpleDateFormat outputFormat = new SimpleDateFormat(OUTPUT_DATE_FORMAT, new Locale("es", "ES"));
      Date parsedDate = inputFormat.parse(date);
      return outputFormat.format(parsedDate);

    } catch (Exception exception) {
      throw new IllegalArgumentException("Invalid date format - dd/MM/yyyy", exception);
    }
  }

}
