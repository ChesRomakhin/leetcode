package ru.chesromakhin.leetcode.problems5xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem567Test {

  static Stream<List<Object>> testData() {
    return Stream.of(
      Arrays.asList("ab", "eidbaooo", true),
      Arrays.asList("ab", "eidboaoo", false),
      Arrays.asList("abcdefj", "eidbdcejfoaoo", false),
      Arrays.asList("abcdefg", "eidbdcegfaooo", true),
      Arrays.asList("hello", "ooolleoooleh", false),
      Arrays.asList("ab", "a", false)
    );
  }

  @ParameterizedTest
  @MethodSource("testData")
  void test(List<Object> caseData) {
    assertEquals(caseData.get(2), new Problem567().checkInclusion((String) caseData.get(0), (String) caseData.get(1)));
  }

}