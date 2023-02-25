package ru.chesromakhin.leetcode.problems1xx;

public class Problem121 {

  public int maxProfit(int[] prices) {
    int n = prices.length;
    int maxProfit = 0;
    int maxPrice = prices[n - 1];

    for (int i = n - 2; i >= 0; i--) {
      int price = prices[i];
      maxProfit = Math.max(maxPrice - price, maxProfit);
      maxPrice = Math.max(price, maxPrice);
    }

    return maxProfit;
  }

}
