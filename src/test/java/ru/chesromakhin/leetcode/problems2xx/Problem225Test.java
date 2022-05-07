package ru.chesromakhin.leetcode.problems2xx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem225Test {

  @Test
  void testStack() {
    Problem225.MyStack myStack = new Problem225.MyStack();
    myStack.push(1);
    myStack.push(2);
    assertEquals(2, myStack.top());
    assertEquals(2, myStack.pop());
    assertFalse(myStack.empty());
  }

}