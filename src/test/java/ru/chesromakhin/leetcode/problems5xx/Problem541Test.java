package ru.chesromakhin.leetcode.problems5xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem541Test {

  static Stream<List<Object>> getCases() {
    return Stream.of(
      List.of("bacdfeg", "abcdefg", 2),
      List.of("abc", "cba", 4),
      List.of("a", "a", 1)
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void testSolution(List<Object> caseData) {
    assertEquals(
      caseData.get(0),
      new Problem541().reverseStr(
        caseData.get(1).toString(),
        (Integer) caseData.get(2)
      )
    );
  }

}