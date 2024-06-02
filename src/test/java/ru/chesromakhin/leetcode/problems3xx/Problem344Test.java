package ru.chesromakhin.leetcode.problems3xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem344Test {

  static Stream<String> getCases() {
    return Stream.of(
      "Hello",
      "Hannah",
      "a",
      "ab",
      "abc"
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void testSolution(String caseData) {
    char[] charArray = caseData.toCharArray();
    char[] charArray1 = new StringBuilder(caseData).reverse().toString().toCharArray();

    new Problem344().reverseString(charArray);

    assertArrayEquals(charArray1, charArray);
  }

}