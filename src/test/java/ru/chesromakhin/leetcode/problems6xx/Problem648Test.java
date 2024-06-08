package ru.chesromakhin.leetcode.problems6xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem648Test {

  static Stream<List<Object>> getCases() {
    return Stream.of(
      List.of(List.of("cat","bat","rat"), "the cattle was rattled by the battery", "the cat was rat by the bat"),
      List.of(List.of("a","b","c"), "aadsfasf absbs bbab cadsfafs", "a a b c")
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void testSolution(List<Object> caseData) {
    assertEquals(caseData.get(2), new Problem648().replaceWords((List<String>) caseData.get(0), (String) caseData.get(1)));
  }

}