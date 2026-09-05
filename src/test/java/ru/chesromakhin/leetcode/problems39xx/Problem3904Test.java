package ru.chesromakhin.leetcode.problems39xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem3904Test {

  static Stream<List<Object>> getCases() {
    return Stream.of(
      List.of(new int[]{5, 0, 1, 4}, 3, 3),
      List.of(new int[]{3, 2, 1}, 1, -1),
      List.of(new int[]{0}, 0, 0),
      List.of(new int[]{5, 5}, 2, 0)
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void firstStableIndex(List<Object> caseData) {
    assertEquals(caseData.getLast(), new Problem3904().firstStableIndex((int[]) caseData.get(0), (Integer) caseData.get(1)));
  }
}