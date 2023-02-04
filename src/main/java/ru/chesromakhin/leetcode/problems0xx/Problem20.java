package ru.chesromakhin.leetcode.problems0xx;

import java.util.Stack;

public class Problem20 {

  public boolean isValid(String s) {
    Stack<Character> parenStack = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (c == '(' || c == '[' || c == '{') {
        parenStack.push(c);
        continue;
      }

      if (parenStack.isEmpty()) {
        return false;
      }

      Character p = parenStack.pop();
      if (!((c == ')' && p == '(') ||
        (c == ']' && p == '[') ||
        (c == '}' && p == '{'))) {
        return false;
      }
    }

    return parenStack.isEmpty();
  }

}
