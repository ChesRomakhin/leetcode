package ru.chesromakhin.leetcode.problems0xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem20Test {

  static Stream<String> correctData() {
    return Stream.of(
      "()",
      "()[]{}",
      "(()[]{})[]",
      "{(()[])({[]})}"
    );
  }

  static Stream<String> incorrectData() {
    return Stream.of(
      "(()",
      "()[)]{}",
      "(()[(]{})[]",
      "{(()[])({[]}})}"
    );
  }

  @ParameterizedTest
  @MethodSource("correctData")
  void testCorrect(String caseData) {
    assertTrue(new Problem20().isValid(caseData));
  }

  @ParameterizedTest
  @MethodSource("incorrectData")
  void testIncorrect(String caseData) {
    assertFalse(new Problem20().isValid(caseData));
  }

}