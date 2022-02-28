package ru.chesromakhin.leetcode.problem2;

public class Solution {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    var result = calculateNextNode(l1, l2, 0);
    var lastNode = result;

    int additional = 0;
    if (lastNode.val >= 10) {
      lastNode.val -= 10;
      additional = 1;
    }

    l1 = l1.next;
    l2 = l2.next;

    while (l1 != null || l2 != null) {
      lastNode.next = calculateNextNode(l1, l2, additional);
      lastNode = lastNode.next;
      additional = 0;

      if (lastNode.val >= 10) {
        lastNode.val -= 10;
        additional = 1;
      }

      if (l1 != null) {
        l1 = l1.next;
      }

      if (l2 != null) {
        l2 = l2.next;
      }
    }

    if (additional == 1) {
      lastNode.next = new ListNode();
      lastNode.next.val = 1;
    }

    return result;
  }

  public ListNode calculateNextNode(ListNode l1, ListNode l2, int additional) {
    var result = new ListNode();
    result.val = additional;
    if (l1 != null) {
      result.val += l1.val;
    }

    if (l2 != null) {
      result.val += l2.val;
    }

    return result;
  }

}
