package ru.chesromakhin.leetcode.problems3xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem392Test {

  static Stream<List<Object>> getCases() {
    return Stream.of(
      List.of("abc", "ahbgdc", true),
      List.of("axc", "ahbgdc", false),
      List.of("", "ahbgdc", true),
      List.of("a", "", false),
      List.of("", "", true)
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void testSolution(List<Object> caseData) {
    assertEquals(
      caseData.get(2),
      new Problem392().isSubsequence(
        caseData.get(0).toString(),
        caseData.get(1).toString()
      )
    );
  }

}