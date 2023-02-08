package ru.chesromakhin.leetcode.problems2xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem217Test {

  static Stream<List<Object>> getCases() {
    return Stream.of(
      Arrays.asList(true, new int[]{2,3,1,1,4}),
      Arrays.asList(false, new int[]{2,3,0,1,4})
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void testSolution(List<Object> caseData) {
    assertEquals(
      caseData.get(0),
      new Problem217().containsDuplicate((int[]) caseData.get(1))
    );
  }

}