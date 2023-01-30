package ru.chesromakhin.leetcode.problems5xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem509Test {

  static Stream<int[]> testData() {
    return Stream.of(
      new int[]{0,0},
      new int[]{1,1},
      new int[]{2,1},
      new int[]{3,2},
      new int[]{4,3},
      new int[]{5,5},
      new int[]{6,8},
      new int[]{7,13},
      new int[]{23,28657}
    );
  }

  @ParameterizedTest
  @MethodSource("testData")
  void test(int[] caseData) {
    assertEquals(caseData[1], new Problem509().fib(caseData[0]));
  }

  @ParameterizedTest
  @MethodSource("testData")
  void testMath(int[] caseData) {
    assertEquals(caseData[1], new Problem509().fibMath(caseData[0]));
  }

}