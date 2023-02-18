package ru.chesromakhin.leetcode.problems1xx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem125Test {

  @Test
  void test1() {
    assertTrue(new Problem125().isPalindrome(" "));
  }

  @Test
  void test2() {
    assertFalse(new Problem125().isPalindrome("race a car"));
  }

  @Test
  void test3() {
    assertTrue(new Problem125().isPalindrome("A man, a plan, a canal: Panama"));
  }

  @Test
  void test4() {
    assertTrue(new Problem125().isPalindrome(".,"));
  }

  @Test
  void test5() {
    assertFalse(new Problem125().isPalindrome("0P"));
  }

}