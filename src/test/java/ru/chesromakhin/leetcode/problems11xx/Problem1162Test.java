package ru.chesromakhin.leetcode.problems11xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem1162Test {

  static Stream<List<Object>> getCases() {
    return Stream.of(
      Arrays.asList(new int[][]{{1,0,1},{0,0,0},{1,0,1}}, 2),
      Arrays.asList(new int[][]{{1,0,0},{0,0,0},{0,0,0}}, 4),
      Arrays.asList(new int[][]{{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}}, -1)
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void testSolution(List<Object> caseData) {
    assertEquals(caseData.get(1), new Problem1162().maxDistance((int[][]) caseData.get(0)));
  }

}