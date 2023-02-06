package ru.chesromakhin.leetcode.problems14xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem1470Test {

  static Stream<int[][]> getCases() {
    return Stream.of(
      new int[][]{{1, 2, 3, 4},{1, 3, 2, 4}},
      new int[][]{{1, 2},{1, 2}},
      new int[][]{{1,2,3,4,4,3,2,1}, {1,4,2,3,3,2,4,1}}
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void testSolution(int[][] caseData) {
    assertArrayEquals(
      caseData[1],
      new Problem1470().shuffle(caseData[0], caseData[0].length / 2)
    );
  }

}