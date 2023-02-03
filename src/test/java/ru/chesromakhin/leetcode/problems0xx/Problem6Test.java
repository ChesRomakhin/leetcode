package ru.chesromakhin.leetcode.problems0xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem6Test {

  static Stream<List<Object>> getCases() {
    return Stream.of(
      Arrays.asList("A", 1, "A"),
      Arrays.asList("PAYPALISHIRING", 3, "PAHNAPLSIIGYIR"),
      Arrays.asList("HELLOWORLDHELLOWORLD", 10, "HLERDLOLWOOWLOLRELHD"),
      Arrays.asList("AB", 1, "AB"),
      Arrays.asList("PAYPALISHIRING", 4, "PINALSIGYAHRPI")
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void testSolution(List<Object> caseData) {
    assertEquals(
      caseData.get(2),
      new Problem6().convert((String) caseData.get(0), (Integer) caseData.get(1))
    );
  }

}