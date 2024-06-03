package ru.chesromakhin.leetcode.problems9xx;

/**
 * 917. Reverse Only Letters
 * Given a string s, reverse the string according to the following rules:
 * All the characters that are not English letters remain in the same position.
 * All the English letters (lowercase or uppercase) should be reversed.
 * Return s after reversing it.
 */
public class Problem917 {

  public String reverseOnlyLetters(String s) {
    char[] a = s.toCharArray();

    int start = 0;
    int end = s.length() - 1;

    char acc;

    while (start < end) {
      while(start < a.length && !((a[start] >= 'a' && a[start] <= 'z') || (a[start] >= 'A' && a[start] <= 'Z'))) {
        start++;
      }

      while(end >= 0 && !((a[end] >= 'a' && a[end] <= 'z') || (a[end] >= 'A' && a[end] <= 'Z')) || end == 0) {
        end--;
      }

      if (start < end) {
        acc = a[start];
        a[start] = a[end];
        a[end] = acc;
        start++;
        end--;
      }
    }

    return new String(a);
  }

}
