package ru.chesromakhin.leetcode.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void addTwoNumbers1() {
    var solution = new Solution();
    ListNode a = ListNode.ofNumber(342);
    ListNode b = ListNode.ofNumber(465);
    ListNode sum = solution.addTwoNumbers(a, b);

    ListNode expected = ListNode.ofNumber(807);

    System.out.println(a + "+" + b + "=" + expected);

    assertEquals(expected, sum);
  }

  @Test
  void addTwoNumbers2() {
    var solution = new Solution();
    ListNode a = new ListNode();
    ListNode b = new ListNode();
    ListNode sum = solution.addTwoNumbers(a, b);

    ListNode expected = new ListNode();

    System.out.println(a + "+" + b + "=" + expected);

    assertEquals(expected, sum);
  }

  @Test
  void addTwoNumbers3() {
    var solution = new Solution();
    ListNode a = ListNode.ofNumber(9999);
    ListNode b = ListNode.ofNumber(9999999);
    ListNode sum = solution.addTwoNumbers(a, b);

    ListNode expected = ListNode.ofNumber(10009998);

    System.out.println(a + "+" + b + "=" + expected);

    assertEquals(expected, sum);
  }

}