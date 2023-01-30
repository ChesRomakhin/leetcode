package ru.chesromakhin.leetcode.problems11xx;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Problem1137Test {

  static Stream<int[]> testData() {
    return Stream.of(
      new int[]{0,0},
      new int[]{1,1},
      new int[]{2,1},
      new int[]{3,2},
      new int[]{4,4},
      new int[]{25,1389537}
    );
  }

  @ParameterizedTest
  @MethodSource("testData")
  void test(int[] caseData) {
    assertEquals(caseData[1], new Problem1137().tribonacci(caseData[0]));
  }

}