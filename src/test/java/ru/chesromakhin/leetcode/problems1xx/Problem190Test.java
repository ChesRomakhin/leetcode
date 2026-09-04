package ru.chesromakhin.leetcode.problems1xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem190Test {

  static Stream<List<Integer>> getCases() {
    return Stream.of(
      List.of(43261596, 964176192),
      List.of(2147483644, 1073741822),
      List.of(2, 1 << 30)
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void reverseBits(List<Integer> caseData) {
    assertEquals(caseData.getLast(), new Problem190().reverseBits(caseData.getFirst()));
  }

}