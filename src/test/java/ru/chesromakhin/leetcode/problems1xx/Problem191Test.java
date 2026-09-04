package ru.chesromakhin.leetcode.problems1xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem191Test {

  static Stream<List<Integer>> getCases() {
    return Stream.of(
      List.of(11, 3),
      List.of(4, 1),
      List.of(1 << 30, 1),
      List.of(2147483645, 30)
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void hammingWeight(List<Integer> caseData) {
    assertEquals(caseData.getLast(), new Problem191().hammingWeight(caseData.getFirst()));
  }
}