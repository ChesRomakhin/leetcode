package ru.chesromakhin.leetcode.problems12xx;

import org.junit.jupiter.api.Test;
import ru.chesromakhin.leetcode.problems3xx.problem338.Solution;

import static org.junit.jupiter.api.Assertions.*;

class Problem1209Test {

  @Test
  void longTest() {
    Problem1209 solution = new Problem1209();
    String result = solution.removeDuplicates("pbbcggttciiippooaais", 2);

    assertEquals("ps", result);
  }

}