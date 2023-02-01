package ru.chesromakhin.leetcode.problems10xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Problem1071Test {

  static Stream<List<String>> getCases() {
    return Stream.of(
      Arrays.asList("ABCABC", "ABC", "ABC"),
      Arrays.asList("AA", "A", "A"),
      Arrays.asList("ABABAB", "ABAB", "AB"),
      Arrays.asList("LEET", "CODE", "")
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void testSolution(List<String> caseData) {
    assertEquals(
      caseData.get(2),
      new Problem1071().gcdOfStrings(caseData.get(0), caseData.get(1))
    );
  }

}