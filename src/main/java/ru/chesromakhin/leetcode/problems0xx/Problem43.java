package ru.chesromakhin.leetcode.problems0xx;

public class Problem43 {

  public String multiply(String num1, String num2) {
    if (num2.length() > num1.length()) {
      String acc = num1;
      num1 = num2;
      num2 = acc;
    }

    int[] positions = new int[num1.length() + num2.length()];

    char[] ac1 = num1.toCharArray();
    char[] ac2 = num2.toCharArray();

    int[] ab1 = new int[ac1.length];
    for (int i = 0; i < ac1.length; i++) {
      ab1[i] = (byte) (ac1[i] - '0');
    }

    int[] ab2 = new int[ac2.length];
    for (int i = 0; i < ac2.length; i++) {
      ab2[i] = (byte) (ac2[i] - '0');
    }

    for (int i = ab2.length - 1; i >= 0; i--) {
      int p = ab2[i];
      int shift = ab2.length - 1 - i;
      int acc = 0;
      for (int j = ab1.length - 1; j >= 0; j--) {
        acc += ab1[j] * p;

        int pi = ac1.length - 1 - j + shift;
        positions[pi] += acc;
        acc = positions[pi] / 10;
        positions[pi] %= 10;
      }

      while (acc > 0) {
        positions[ac1.length + shift] += acc;
        acc = positions[ac1.length + shift] / 10;
        positions[ac1.length + shift] %= 10;
        shift++;
      }
    }

    StringBuilder builder = new StringBuilder();
    boolean leadingZero = true;
    for (int i = positions.length - 1; i >= 0; i--) {
      int position = positions[i];

      leadingZero = leadingZero && position == 0;

      if (position != 0 || !leadingZero) {
        builder.append(position);
      }
    }

    if (builder.isEmpty()) {
      return "0";
    } else {
      return builder.toString();
    }
  }

}
