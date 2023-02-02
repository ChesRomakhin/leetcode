package ru.chesromakhin.leetcode.problems9xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem953Test {

  static Stream<List<Object>> getCases() {
    return Stream.of(
      Arrays.asList(new String[]{"hello"}, "hlabcdefgijkmnopqrstuvwxyz", true),
      Arrays.asList(new String[]{"hello","leetcode"}, "hlabcdefgijkmnopqrstuvwxyz", true),
      Arrays.asList(new String[]{"word","world","row"}, "worldabcefghijkmnpqstuvxyz", false),
      Arrays.asList(new String[]{"apple","app"}, "abcdefghijklmnopqrstuvwxyz", false)
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void testSolution(List<Object> caseData) {
    assertEquals(
      caseData.get(2),
      new Problem953().isAlienSorted((String[]) caseData.get(0), (String) caseData.get(1))
    );
  }

}