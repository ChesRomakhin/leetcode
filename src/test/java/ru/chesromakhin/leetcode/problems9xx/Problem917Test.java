package ru.chesromakhin.leetcode.problems9xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem917Test {

  static Stream<List<Object>> getCases() {
    return Stream.of(
      List.of("ab-cd", "dc-ba"),
      List.of("a-bC-dEf-ghIj", "j-Ih-gfE-dCba"),
      List.of("7_28]", "7_28]"),
      List.of("Test1ng-Leet=code-Q!", "Qedo1ct-eeLg=ntse-T!")
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void testSolution(List<Object> caseData) {
    assertEquals(
      caseData.get(1),
      new Problem917().reverseOnlyLetters(
        caseData.get(0).toString()
      )
    );
  }

}