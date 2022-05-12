package ru.chesromakhin.leetcode.problems0xx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem3Test {

  @Test
  void lengthOfLongestSubstring() {
    int result = new Problem3().lengthOfLongestSubstring("abcabcbb");

    assertEquals(3, result);
  }

  @Test
  void lengthOfLongestSubstring2() {
    int result = new Problem3().lengthOfLongestSubstring("bbbbbb");

    assertEquals(1, result);
  }

  @Test
  void lengthOfLongestSubstring3() {
    int result = new Problem3().lengthOfLongestSubstring("pwwkew");

    assertEquals(3, result);
  }

  @Test
  void lengthOfLongestSubstring4() {
    int result = new Problem3().lengthOfLongestSubstring("au");

    assertEquals(2, result);
  }

  @Test
  void lengthOfLongestSubstring5() {
    int result = new Problem3().lengthOfLongestSubstring(" ");

    assertEquals(1, result);
  }

  @Test
  void lengthOfLongestSubstring6() {
    int result = new Problem3().lengthOfLongestSubstring("aab");

    assertEquals(2, result);
  }

  @Test
  void lengthOfLongestSubstring7() {
    int result = new Problem3().lengthOfLongestSubstring("aabaab!bb");

    assertEquals(3, result);
  }

}