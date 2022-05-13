package ru.chesromakhin.leetcode.problems16xx;

public class Problem1641 {

  public int countVowelStrings(int n) {
    return calcSums(n - 1, 5);
  }

  public int calcSums(int level, int start) {
    if (level == 0) {
      return start;
    }

    int sum = 0;
    for (int i = start; i > 0; i--) {
      sum += calcSums(level - 1, i);
    }

    return sum;
  }

}
