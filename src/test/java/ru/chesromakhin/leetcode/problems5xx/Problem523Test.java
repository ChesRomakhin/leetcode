package ru.chesromakhin.leetcode.problems5xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem523Test {

  record CaseData(
    int[] nums,
    int k,
    boolean result
  ) {}

  static Stream<CaseData> getCases() {
    return Stream.of(
      new CaseData(new int[]{23,2,4,6,7}, 6, true),
      new CaseData(new int[]{0,0}, 1, true),
      new CaseData(new int[]{23,2,6,4,7}, 13, false),
      new CaseData(new int[]{23,2,6,4,7}, 6, true)
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void testSolution(CaseData caseData) {
    assertEquals(caseData.result, new Problem523().checkSubarraySum(caseData.nums, caseData.k));
  }

}