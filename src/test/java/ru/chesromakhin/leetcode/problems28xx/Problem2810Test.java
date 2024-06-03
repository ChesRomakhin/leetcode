package ru.chesromakhin.leetcode.problems28xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem2810Test {

  static Stream<List<Object>> getCases() {
    return Stream.of(
      List.of("string", "rtsng"),
      List.of("poiinter", "ponter")
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void testSolution(List<Object> caseData) {
    assertEquals(
      caseData.get(1),
      new Problem2810().finalString(
        caseData.get(0).toString()
      )
    );
  }

}