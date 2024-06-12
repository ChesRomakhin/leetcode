package ru.chesromakhin.leetcode.problems11xx;

import java.util.*;

/**
 * 1122. Relative Sort Array
 * Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
 * Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.
 */
public class Problem1122 {

  public int[] relativeSortArray(int[] arr1, int[] arr2) {
    Map<Integer, Integer> freqs = new HashMap<>();
    for (int n : arr1) {
      if (!freqs.containsKey(n)) {
        freqs.put(n, 1);
      } else {
        freqs.put(n, freqs.get(n) + 1);
      }
    }

    List<Integer> list = new ArrayList<>(arr1.length);
    for (int n : arr2) {
      if (freqs.containsKey(n)) {
        for (int i = 0; i < freqs.get(n); i++) {
          list.add(n);
        }
      }

      freqs.remove(n);
    }

    List<Integer> endList = new ArrayList<>(arr1.length);
    if (!freqs.isEmpty()) {
      for (int n : freqs.keySet()) {
        for (int i = 0; i < freqs.get(n); i++) {
          endList.add(n);
        }
      }
      Collections.sort(endList);
    }

    list.addAll(endList);

    return list.stream().mapToInt(a -> a).toArray();
  }

}
