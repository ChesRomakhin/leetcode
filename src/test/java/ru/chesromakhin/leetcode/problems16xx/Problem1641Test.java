package ru.chesromakhin.leetcode.problems16xx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem1641Test {

  @Test
  void countVowelStrings() {
    int result = new Problem1641().countVowelStrings(2);

    assertEquals(15, result);
  }

  @Test
  void countVowelStrings2() {
    int result = new Problem1641().countVowelStrings(33);

    assertEquals(66045, result);
  }

}