package ru.chesromakhin.leetcode.problems5xx;

/**
 * 557. Reverse Words in a String III
 * Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 */
public class Problem557 {

  public String reverseWords(String s) {
    char[] a = s.toCharArray();

    int start = 0;
    for (int i = 0; i < a.length; i++) {
      char c = a[i];

        if (c != ' ') {
            continue;
        }

        if (start - i == 1) {
          start = i;
          continue;
        }

        this.reverseSubstring(a, start, i - 1);
        start = i + 1;
    }

    reverseSubstring(a, start, a.length - 1);

    return new String(a);
  }

  public void reverseSubstring(char[] a, int start, int end) {
    char acc;
    while (start < end) {
      acc = a[end];
      a[end] = a[start];
      a[start] = acc;

      end--;
      start++;
    }
  }

}
