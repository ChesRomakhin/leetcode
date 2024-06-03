package ru.chesromakhin.leetcode.problems24xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem2486Test {

  static Stream<List<Object>> getCases() {
    return Stream.of(
      List.of("coaching", "coding", 4),
      List.of("abcde", "a", 0),
      List.of("z", "abcde", 5)
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void testSolution(List<Object> caseData) {
    assertEquals(
      caseData.get(2),
      new Problem2486().appendCharacters(
        caseData.get(0).toString(),
        caseData.get(1).toString()
      )
    );
  }

}