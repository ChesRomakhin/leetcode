package ru.chesromakhin.leetcode.problems9xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem945Test {

  record CaseData(
    int[] nums,
    int result
  ) {
  }

  static Stream<CaseData> getCases() {
    return Stream.of(
      new CaseData(new int[]{1, 2, 2}, 1),
      new CaseData(new int[]{3, 2, 1, 2, 1, 7}, 6)
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void testSolution(CaseData caseData) {
    assertEquals(caseData.result, new Problem945().minIncrementForUnique(caseData.nums));
  }

}