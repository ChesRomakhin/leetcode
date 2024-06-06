package ru.chesromakhin.leetcode.problems8xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem846Test {

  static Stream<List<Object>> getCases() {
    return Stream.of(
      List.of(new int[]{1,2,3,6,2,3,4,7,8}, 3, true),
      List.of(new int[]{1,2,3,6,10,3,4,7,8}, 3, false),
      List.of(new int[]{1,2,3,4,5}, 4, false)
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void testSolution(List<Object> caseData) {
    assertEquals(caseData.get(2), new Problem846().isNStraightHand((int[]) caseData.get(0), (Integer) caseData.get(1)));
  }

}