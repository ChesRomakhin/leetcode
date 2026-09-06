package ru.chesromakhin.leetcode.problems38xx;

public class Problem3875 {

  public boolean uniformArray(int[] nums1) {
    int n = nums1.length;

    boolean[] odds = new boolean[n];
    boolean[] evens = new boolean[n];

    for (int i = 0; i < n; i++) {
      if (nums1[i] % 2 != 0) {
        odds[i] = true;

        if (evens[i]) {
          continue;
        }

        for (int j = 0; j < n; j++) {
          if (i == j) {
            continue;
          }

          if ((nums1[i] - nums1[j]) % 2 == 0) {
            evens[i] = true;
            evens[j] = true;
            break;
          }
        }
      } else {
        evens[i] = true;

        if (odds[i]) {
          continue;
        }

        for (int j = 0; j < n; j++) {
          if (i == j) {
            continue;
          }

          if ((nums1[i] - nums1[j]) % 2 != 0) {
            odds[i] = true;
            odds[j] = true;
            break;
          }
        }
      }
    }

    boolean or = true;
    boolean er = true;
    for (int i = 0; i < n; i++) {
      or = or && odds[i];
      er = er && evens[i];
    }

    return or || er;
  }

}
