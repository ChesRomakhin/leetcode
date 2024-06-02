package ru.chesromakhin.leetcode.problems3xx;

/**
 * 345. Reverse Vowels of a String
 * Given a string s, reverse only all the vowels in the string and return it.
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 * examples:
 * hello -> holle
 * leetcode -> leotcede
 */
public class Problem345 {

  private final char[] letters = new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

  public String reverseVowels(String s) {
    char[] a = s.toCharArray();
    int start = 0;
    int end = a.length - 1;

    while (end > start) {
      boolean endCheck = isVowel(a[end]);
      boolean startCheck = isVowel(a[start]);

      if (startCheck && endCheck) {
        a[end] = (char) (a[start] ^ a[end]);
        a[start] = (char) (a[start] ^ a[end]);
        a[end] = (char) (a[start] ^ a[end]);
        start++;
        end--;
        continue;
      }

      if (!startCheck) {
        start++;
      }

      if (!endCheck) {
        end--;
      }
    }

    return new String(a);
  }

  public boolean isVowel(char c) {
    for (char letter : this.letters) {
      if (letter == c) {
        return true;
      }
    }

    return false;
  }

}
