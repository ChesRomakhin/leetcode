package ru.chesromakhin.leetcode.problems2xx;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Problem217 {

  public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>();

    for (int num : nums) {
      if (!set.add(num)) {
        return true;
      }
    }

    return false;
  }

}
