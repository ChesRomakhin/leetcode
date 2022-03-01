package ru.chesromakhin.leetcode.problems0xx.problem1;

import org.junit.jupiter.api.Test;
import ru.chesromakhin.leetcode.problems0xx.problem1.Solution;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

  @Test
  public void testCase1() {
    var solution = new Solution();
    var result = solution.twoSum(new int[]{2,7,11,15}, 9);
    assertEquals(Set.of(0, 1), Set.of(result[0], result[1]));
  }

  @Test
  public void testCase2() {
    var solution = new Solution();
    var result = solution.twoSum(new int[]{3,2,4}, 6);
    assertEquals(Set.of(2, 1), Set.of(result[0], result[1]));
  }

  @Test
  public void testCase3() {
    var solution = new Solution();
    var result = solution.twoSum(new int[]{3,3}, 6);
    assertEquals(Set.of(0, 1), Set.of(result[0], result[1]));
  }

}