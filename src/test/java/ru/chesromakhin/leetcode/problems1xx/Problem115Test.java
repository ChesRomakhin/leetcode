package ru.chesromakhin.leetcode.problems1xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem115Test {

  static Stream<List<Object>> getCases() {
    return Stream.of(
      List.of("rabbbit", "rabbit", 3),
      List.of("babgbag", "bag", 5),
      List.of("adbdadeecadeadeccaeaabdabdbcdabddddabcaaadbabaaedeeddeaeebcdeabcaaaeeaeeabcddcebddebeebedaecccbdcbcedbdaeaedcdebeecdaaedaacadbdccabddaddacdddc", "bcddceeeebecbc", 700531452)
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void numDistinct(List<Object> caseData) {
    assertEquals(caseData.getLast(), new Problem115().numDistinct(caseData.get(0).toString(), caseData.get(1).toString()));
  }
}