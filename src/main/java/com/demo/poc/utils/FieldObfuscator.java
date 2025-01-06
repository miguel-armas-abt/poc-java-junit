package com.demo.poc.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FieldObfuscator {

  private static final String OBFUSCATION_MASK = "***";

  public static String partiallyObfuscate(String sensitiveValue) {
    return sensitiveValue.length() > 6
        ? sensitiveValue.substring(0, 3) + OBFUSCATION_MASK + sensitiveValue.substring(sensitiveValue.length() - 3)
        : sensitiveValue;
  }
}
