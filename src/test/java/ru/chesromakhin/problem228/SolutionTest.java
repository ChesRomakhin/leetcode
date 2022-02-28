package ru.chesromakhin.problem228;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  public void testCase1() {
    var solution = new Solution();
    var result = solution.summaryRanges(new int[]{0, 1, 2, 4, 5, 7});
    assertEquals(List.of("0->2", "4->5", "7"), result);
  }

  @Test
  public void testCase2() {
    var solution = new Solution();
    var result = solution.summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9});
    assertEquals(List.of("0", "2->4", "6", "8->9"), result);
  }

  @Test
  public void testCase3() {
    var solution = new Solution();
    var result = solution.summaryRanges(new int[0]);
    assertEquals(Collections.emptyList(), result);
  }

}