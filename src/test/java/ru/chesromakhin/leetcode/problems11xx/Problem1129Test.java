package ru.chesromakhin.leetcode.problems11xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Problem1129Test {

  static Stream<List<Object>> getCases() {
    return Stream.of(
      Arrays.asList(
        5,
        new int[][]{{0,1},{1,2},{2,3},{3,4}},
        new int[][]{{1,2},{2,3},{3,1}},
        new int[]{0,1,2,3,7}
      ),
      Arrays.asList(
        3,
        new int[][]{{0,1},{0,2}},
        new int[][]{{1,0}},
        new int[]{0,1,1}
      ),
      Arrays.asList(
        5,
        new int[][]{{2,2},{0,1},{0,3},{0,0},{0,4},{2,1},{2,0},{1,4},{3,4}},
        new int[][]{{1,3},{0,0},{0,3},{4,2},{1,0}},
        new int[]{0,1,2,1,1}
      )
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void testSolution(List<Object> caseData) {
    assertArrayEquals((int[]) caseData.get(3), new Problem1129().shortestAlternatingPaths((Integer) caseData.get(0), (int[][]) caseData.get(1), (int[][]) caseData.get(2)));
  }

}