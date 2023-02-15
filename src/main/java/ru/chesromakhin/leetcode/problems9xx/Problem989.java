package ru.chesromakhin.leetcode.problems9xx;

import java.util.LinkedList;
import java.util.List;

public class Problem989 {

  public List<Integer> addToArrayForm(int[] num, int k) {
    LinkedList<Integer> result = new LinkedList<>();

    int accumulator = 0;
    int i = num.length - 1;
    while (i >= 0 || k > 0) {
      if (i >= 0) {
        accumulator += num[i--];
      }

      accumulator += k % 10;

      result.addFirst(accumulator % 10);

      k = k / 10;
      accumulator = accumulator / 10;
    }

    if (accumulator > 0) {
      result.addFirst(accumulator);
    }

    return result;
  }

}
