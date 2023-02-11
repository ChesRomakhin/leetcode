package ru.chesromakhin.leetcode.problems11xx;

public class Problem1162 {

  public int maxDistance(int[][] grid) {
    int n = grid.length;

    if (n < 2) {
      return -1;
    }

    int k = n + 2;

    int[][] extendedGrid = new int[k][k];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        extendedGrid[i + 1][j + 1] = grid[i][j];
      }
    }

    int max = 0;

    boolean changed = true;
    while (changed) {
      changed = false;
      int[][] gridCopy = new int[k][k];

      for (int i = 1; i < n + 1; i++) {
        for (int j = 1; j < n + 1; j++) {
          if (extendedGrid[i][j] == 0) {
            gridCopy[i][j] = min(extendedGrid[i][j + 1], extendedGrid[i + 1][j], extendedGrid[i - 1][j], extendedGrid[i][j - 1]) + 1;
            max = Math.max(max, gridCopy[i][j]);
            changed = changed || gridCopy[i][j] != extendedGrid[i][j];
          } else {
            gridCopy[i][j] = extendedGrid[i][j];
          }
        }
      }

      extendedGrid = gridCopy;
    }

    if (max == 1) {
      max = 0;
    }

    return max - 1;
  }

  private int min(int a, int b, int c, int d) {
    int result = 1000;

    if (a != 0) {
      result = Math.min(a, result);
    }

    if (b != 0) {
      result = Math.min(b, result);
    }

    if (c != 0) {
      result = Math.min(c, result);
    }

    if (d != 0) {
      result = Math.min(d, result);
    }

    if (result == 1000) {
      return -1;
    }

    return result;
  }

}
