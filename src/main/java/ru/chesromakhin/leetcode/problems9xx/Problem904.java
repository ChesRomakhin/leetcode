package ru.chesromakhin.leetcode.problems9xx;

import java.util.HashMap;
import java.util.Map;

public class Problem904 {

  public int totalFruit(int[] fruits) {
    // Initializing a map for keeping count of distinct fruits
    Map<Integer, Integer> fruitCount = new HashMap<>();

    // i is front pointer of sliding window
    // j is rear pointer of sliding window
    // ans will store the maximum subarray length
    int i = 0, j = 0, ans = 0;
    while (i < fruits.length) {
      // picking up the fruit
      fruitCount.put(fruits[i], fruitCount.getOrDefault(fruits[i], 0) + 1);
      // if no. of distinct fruits is more than two
      // we will move our rear pointer and unpick the fruits
      while (fruitCount.size() > 2) {
        int count = fruitCount.get(fruits[j]) - 1;
        fruitCount.put(fruits[j], count);
        // if fruit of a particular type are exhausted
        // clearing the index of that fruit
        if (count == 0) {
          fruitCount.remove(fruits[j]);
        }
        // moving rear pointer
        j++;
      }
      // Storing maximum subarray length with at most 2 distinct fruits
      ans = Math.max(ans, i - j + 1);
      // moving front pointer
      i++;
    }
    // returning the maximum subarray length
    return ans;
  }

}

class Problem904Slow {

  public int totalFruit(int[] fruits) {
    int maxCount = 0;

    for (int i = 0; i < fruits.length; i++) {
      int basket1 = fruits[i];
      int basket2 = fruits[i];
      int basket1Count = 0;
      int basket2Count = 0;

      for (int j = i; j < fruits.length; j++) {
        if (fruits[j] != basket2 && basket2 == basket1) {
          basket2 = fruits[j];
          basket2Count = 1;
          continue;
        }

        if (fruits[j] == basket1) {
          basket1Count++;
          continue;
        }

        if (basket2 != basket1 && fruits[j] == basket2) {
          basket2Count++;
          continue;
        }

        if (basket1 != basket2 && (fruits[j] != basket1 || fruits[j] != basket2)) {
          maxCount = Math.max(maxCount, basket1Count + basket2Count);
          break;
        }
      }

      maxCount = Math.max(maxCount, basket1Count + basket2Count);
    }

    return maxCount;
  }

}
