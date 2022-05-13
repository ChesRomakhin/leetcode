package ru.chesromakhin.leetcode.problems0xx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem4Test {

  @Test
  void findMedianSortedArrays() {
    double median = new Problem4().findMedianSortedArrays(new int[]{1, 3}, new int[]{2});

    assertEquals(2, median);
  }

  @Test
  void findMedianSortedArrays2() {
    double median = new Problem4().findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});

    assertEquals(2.5, median);
  }

  @Test
  void findMedianSortedArrays3() {
    double median = new Problem4().findMedianSortedArrays(new int[]{3, 4}, new int[]{1, 2});

    assertEquals(2.5, median);
  }

  @Test
  void findMedianSortedArrays4() {
    double median = new Problem4().findMedianSortedArrays(new int[]{1}, new int[]{2});

    assertEquals(1.5, median);
  }

}