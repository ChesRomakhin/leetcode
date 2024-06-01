package ru.chesromakhin.leetcode.problems31xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem3110Test {

  static Stream<List<Object>> getCases() {
    return Stream.of(
      List.of("hello", 13),
      List.of("zaz", 50)
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void testSolution(List<Object> caseData) {
    assertEquals(caseData.get(1), new Problem3110().scoreOfString(caseData.get(0).toString()));
  }

}