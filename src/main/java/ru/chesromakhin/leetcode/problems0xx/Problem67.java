package ru.chesromakhin.leetcode.problems0xx;

public class Problem67 {

  public String addBinary(String a, String b) {
    StringBuilder builder = new StringBuilder();

    char[] aa = a.toCharArray();
    char[] ba = b.toCharArray();

    int positionA = a.length() - 1;
    int positionB = b.length() - 1;

    int accumulator = 0;
    while (positionA > -1 || positionB > -1) {
      if (positionA >= 0) {
        accumulator += aa[positionA--] - '0';
      }

      if (positionB >= 0) {
        accumulator += ba[positionB--] - '0';
      }

      builder.append(accumulator & 1);
      accumulator = accumulator >> 1;
    }

    if (accumulator > 0) {
      builder.append(accumulator);
    }

    return builder.reverse().toString();
  }

}
