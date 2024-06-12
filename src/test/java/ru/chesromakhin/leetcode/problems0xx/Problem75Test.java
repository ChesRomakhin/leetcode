package ru.chesromakhin.leetcode.problems0xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem75Test {

  record CaseData(
    int[] nums,
    int[] result
  ) {
  }

  static Stream<CaseData> getCases() {
    return Stream.of(
      new CaseData(new int[]{2}, new int[]{2}),
      new CaseData(new int[]{0}, new int[]{0}),
      new CaseData(new int[]{1}, new int[]{1}),
      new CaseData(new int[]{2, 0, 1}, new int[]{0, 1, 2}),
      new CaseData(new int[]{0, 2, 1}, new int[]{0, 1, 2}),
      new CaseData(new int[]{0, 1, 2}, new int[]{0, 1, 2}),
      new CaseData(new int[]{0, 2, 0}, new int[]{0, 0, 2}),
      new CaseData(new int[]{0, 2, 0, 2}, new int[]{0, 0, 2, 2}),
      new CaseData(new int[]{2, 0, 2, 1, 1, 0}, new int[]{0, 0, 1, 1, 2, 2})
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void testSolution(CaseData caseData) {
    int[] nums = Arrays.copyOf(caseData.nums, caseData.nums.length);
    new Problem75().sortColors(nums);
    assertArrayEquals(caseData.result, nums);
  }

}