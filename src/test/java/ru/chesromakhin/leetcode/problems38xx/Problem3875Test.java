package ru.chesromakhin.leetcode.problems38xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem3875Test {

  static Stream<List<Object>> getCases() {
    return Stream.of(
      List.of(new int[]{2, 3}, true),
      List.of(new int[]{4, 6}, true)
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void uniformArray(List<Object> caseData) {
    assertEquals(caseData.getLast(), new Problem3875().uniformArray((int[]) caseData.getFirst()));
  }
}