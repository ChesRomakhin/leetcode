package ru.chesromakhin.leetcode.problems3xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem345Test {

  static Stream<List<String>> getCases() {
    return Stream.of(
      List.of("hello", "holle"),
      List.of("zaz", "zaz"),
      List.of("leetcode", "leotcede"),
      List.of("a", "a"),
      List.of("ae", "ea"),
      List.of("bc", "bc"),
      List.of("ab", "ab"),
      List.of("Aa", "aA")
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void testSolution(List<String> caseData) {
    assertEquals(caseData.get(1), new Problem345().reverseVowels(caseData.get(0)));
  }

}