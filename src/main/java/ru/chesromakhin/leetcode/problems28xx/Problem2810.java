package ru.chesromakhin.leetcode.problems28xx;

/**
 * 2810. Faulty Keyboard
 * Your laptop keyboard is faulty, and whenever you type a character 'i' on it, it reverses the string that you have written. Typing other characters works as expected.
 * You are given a 0-indexed string s, and you type each character of s using your faulty keyboard.
 * Return the final string that will be present on your laptop screen.
 */
public class Problem2810 {

  public String finalString(String s) {
    StringBuilder b = new StringBuilder();

    boolean forward = true;

    char[] a = s.toCharArray();
    for (char c : a) {
      if (c == 'i') {
        forward = !forward;
      } else {
        if (forward) {
          b.append(c);
        } else {
          b.insert(0, c);
        }
      }
    }

    if (!forward) {
      return b.reverse().toString();
    } else {
      return b.toString();
    }
  }

}
