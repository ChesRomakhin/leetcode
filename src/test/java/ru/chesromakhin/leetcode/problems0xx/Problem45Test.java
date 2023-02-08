package ru.chesromakhin.leetcode.problems0xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem45Test {

  static Stream<List<Object>> getCases() {
    return Stream.of(
      Arrays.asList(2, new int[]{2,3,1,1,4}),
      Arrays.asList(2, new int[]{2,3,0,1,4})
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void testSolution(List<Object> caseData) {
    assertEquals(
      caseData.get(0),
      new Problem45().jump((int[]) caseData.get(1))
    );
  }

}