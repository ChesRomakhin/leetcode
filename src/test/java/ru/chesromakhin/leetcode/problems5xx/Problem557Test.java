package ru.chesromakhin.leetcode.problems5xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem557Test {

  static Stream<List<Object>> getCases() {
    return Stream.of(
      List.of("Let's take LeetCode contest", "s'teL ekat edoCteeL tsetnoc"),
      List.of("Mr Ding", "rM gniD"),
      List.of("Mr  Ding", "rM  gniD"),
      List.of("Mr  a  Ding", "rM  a  gniD")
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void testSolution(List<Object> caseData) {
    assertEquals(
      caseData.get(1),
      new Problem557().reverseWords(
        caseData.get(0).toString()
      )
    );
  }

}