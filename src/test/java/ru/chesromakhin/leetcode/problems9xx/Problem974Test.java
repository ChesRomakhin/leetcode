package ru.chesromakhin.leetcode.problems9xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem974Test {

  record CaseData(
    int[] nums,
    int k,
    int count
  ) {}

  static Stream<CaseData> getCases() {
    return Stream.of(
      new CaseData(new int[]{4,5,0,-2,-3,1}, 5, 7),
      new CaseData(new int[]{-1,2,9}, 2, 2),
      new CaseData(new int[]{8,9,7,8,9}, 8, 7),
      new CaseData(new int[]{5}, 9, 0)
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void testSolution(CaseData caseData) {
    assertEquals(caseData.count, new Problem974().subarraysDivByK(caseData.nums, caseData.k));
  }

}