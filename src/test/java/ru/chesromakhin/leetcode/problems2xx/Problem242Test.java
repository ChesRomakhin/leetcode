package ru.chesromakhin.leetcode.problems2xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem242Test {

  static Stream<List<String>> getTrueCases() {
    return Stream.of(
      Arrays.asList("ab", "ba"),
      Arrays.asList("c", "c"),
      Arrays.asList("anagram", "nagaram")
    );
  }

  static Stream<List<String>> getFalseCases() {
    return Stream.of(
      Arrays.asList("abc", "ba"),
      Arrays.asList("ad", "bc")
    );
  }

  @ParameterizedTest
  @MethodSource("getTrueCases")
  void testTrueSolution(List<Object> caseData) {
    assertTrue(
      new Problem242().isAnagram((String) caseData.get(0), (String) caseData.get(1))
    );
  }

  @ParameterizedTest
  @MethodSource("getFalseCases")
  void testFalseSolution(List<Object> caseData) {
    assertFalse(
      new Problem242().isAnagram((String) caseData.get(0), (String) caseData.get(1))
    );
  }

}