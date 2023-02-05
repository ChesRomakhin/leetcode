package ru.chesromakhin.leetcode.problems4xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class Problem438Test {

  static Stream<List<Object>> getCases() {
    return Stream.of(
      Arrays.asList("cbaebabacd", "abc", Arrays.asList(0,6)),
      Arrays.asList("cbaebacbacd", "abc", Arrays.asList(0,4,5,6,7)),
      Arrays.asList("viacheslavromakhin", "ches", Arrays.asList(3)),
      Arrays.asList("cb", "abc", Collections.emptyList()),
      Arrays.asList("abab", "ab", Arrays.asList(0,1,2))
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void testSolution(List<Object> caseData) {
    assertIterableEquals(
      (List<Integer>) caseData.get(2),
      new Problem438().findAnagrams((String) caseData.get(0), (String) caseData.get(1))
    );
  }

}