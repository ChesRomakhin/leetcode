package ru.chesromakhin.leetcode.problems12xx;

public class Problem1209 {

  public String removeDuplicates(String s, int k) {
    StringBuilder sb = new StringBuilder(s);

    int i = 0;
    char prevSymbol = ' ';
    int count = 1;
    while (sb.length() > i) {
      char current = sb.charAt(i);
      if (current == prevSymbol) {
        count++;

        if (count == k) {
          sb.delete(i - count + 1, i + 1);
          i -= k + k;
          if (i < 0) {
            i = -1;
          }
          prevSymbol = ' ';
          count = 1;
        }
      } else {
        prevSymbol = current;
        count = 1;
      }

      i++;
    }

    return sb.toString();
  }

}
