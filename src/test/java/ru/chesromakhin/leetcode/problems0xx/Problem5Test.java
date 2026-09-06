package ru.chesromakhin.leetcode.problems0xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem5Test {

  static Stream<List<String>> getCases() {
    return Stream.of(
      List.of("babad", "bab"),
      List.of("cbbd", "bb"),
      List.of("cdbb", "bb"),
      List.of("cdbbd", "dbbd"),
      List.of("abcd", "a"),
      List.of("ccc", "ccc"),
      List.of("ccca", "ccc")
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void longestPalindrome(List<String> caseData) {
    assertEquals(caseData.getLast(), new Problem5().longestPalindrome(caseData.getFirst()));
  }

}