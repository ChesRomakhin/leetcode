package ru.chesromakhin.leetcode.problems4xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem409Test {

  static Stream<List<Object>> getCases() {
    return Stream.of(
      List.of("CoaChing", 3),
      List.of("abcde", 1),
      List.of("abccccdd", 7),
      List.of("Aa", 1),
      List.of("a", 1)
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void testSolution(List<Object> caseData) {
    assertEquals(
      caseData.get(1),
      new Problem409().longestPalindrome(
        caseData.get(0).toString()
      )
    );
  }

}