package ru.chesromakhin.leetcode.problems10xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem1002Test {

  static Stream<List<Object>> getCases() {
    return Stream.of(
      List.of(new String[]{"bella", "label", "roller"}, List.of("e", "l", "l")),
      List.of(new String[]{"test"}, List.of("e", "s", "t", "t")),
      List.of(new String[]{"cool","lock","cook"}, List.of("c","o"))
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void testSolution(List<Object> caseData) {
    assertEquals(caseData.get(1), new Problem1002().commonChars((String[]) caseData.get(0)));
  }

}