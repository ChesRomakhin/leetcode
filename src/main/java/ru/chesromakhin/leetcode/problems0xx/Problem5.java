package ru.chesromakhin.leetcode.problems0xx;

public class Problem5 {

  // Manacher
  public String longestPalindrome(String s) {
    int palindromeLength = 1;
    int start = 0;

    int length = s.length() * 2 + 3;
    char[] ms = new char[length];
    ms[0] = '^';

    for (int i = 0; i < s.length(); i++) {
      ms[i * 2 + 1] = '#';
      ms[i * 2 + 2] = s.charAt(i);
    }

    ms[length - 2] = '#';
    ms[length - 1] = '$';

    int[] p = new int[length];
    int l = 0;
    int r = 0;

    for (int i = 1; i < length - 1; i++) {
      int mirror = l + r - i;

      if (i < r) {
        p[i] = Math.min(r - i, p[mirror]);
      }

      while (ms[i + 1 + p[i]] == ms[i - 1 - p[i]]) {
        p[i]++;
      }

      if (i + p[i] > r) {
        l = i - p[i];
        r = i + p[i];
      }

      if (p[i] > palindromeLength) {
        start = (i - p[i] - 1) / 2;
        palindromeLength = p[i];
      }
    }

    return s.substring(start, start + palindromeLength);
  }

  public String longestPalindromeNaive(String s) {
    char[] charArray = s.toCharArray();
    String odd = getPalindrome(charArray, 3);
    String even = getPalindrome(charArray, 2);

    if (odd == null && even == null) {
      return String.valueOf(charArray[0]);
    }

    if (odd == null) {
      return even;
    }

    if (even == null) {
      return odd;
    }

    if (odd.length() > even.length()) {
      return odd;
    } else {
      return even;
    }
  }

  public String getPalindrome(char[] chars, int startLength) {
    if (chars.length < startLength) {
      return null;
    }

    int index = -1;
    int length = -1;

    int startOffset = startLength - 1;

    for (int i = 0; i < chars.length - startOffset; i++) {
      if (chars[i] == chars[i + startOffset]) {
        int candidateIndex = i;
        int candidateLength = startLength;

        if (candidateLength > length) {
          index = candidateIndex;
          length = candidateLength;
        }

        do {
          if (candidateIndex - 1 < 0 || candidateIndex + candidateLength > chars.length - 1) {
            break;
          }

          candidateIndex--;
          candidateLength += 2;

          if (chars[candidateIndex] == chars[candidateIndex + candidateLength - 1]) {
            if (candidateLength > length) {
              index = candidateIndex;
              length = candidateLength;
            }
          } else {
            break;
          }
        } while (true);
      }
    }

    if (index == -1) {
      return null;
    }

    return new String(chars, index, length);
  }

}
