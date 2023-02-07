package ru.chesromakhin.leetcode.problems9xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Problem904Test {

  static Stream<List<Object>> getCases() {
    return Stream.of(
      Arrays.asList(3, new int[]{1,2,1}),
      Arrays.asList(3, new int[]{0,1,2,2}),
      Arrays.asList(4, new int[]{1,2,3,2,2}),
      Arrays.asList(4, new int[]{1,2,3,2,2,1,4}),
      Arrays.asList(3, new int[]{1,1,4,0,4}),
      Arrays.asList(5, new int[]{3,3,3,1,2,1,1,2,3,3,4})
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void testSolution(List<Object> caseData) {
    assertEquals(
      caseData.get(0),
      new Problem904().totalFruit((int[]) caseData.get(1))
    );
  }

}