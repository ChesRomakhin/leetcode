package ru.chesromakhin.leetcode.problems2xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem268Test {

  static Stream<List<Object>> getCases() {
    return Stream.of(
      List.of(new int[]{3, 0, 1}, 2),
      List.of(new int[]{3, 0, 2, 1}, 4),
      List.of(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}, 8)
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void missingNumber(List<Object> caseData) {
    assertEquals(caseData.getLast(), new Problem268().missingNumber((int[]) caseData.getFirst()));
  }

}