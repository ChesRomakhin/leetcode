package ru.chesromakhin.leetcode.problems0xx.problem2;

import java.util.Objects;

//Definition for singly-linked list.
public class ListNode {

  public static ListNode ofNumber(int number) {
    if (number == 0) {
      return null;
    }

    var node = new ListNode();
    node.val = number % 10;
    node.next = ListNode.ofNumber(number / 10);

    return node;
  }

  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListNode listNode = (ListNode) o;
    return val == listNode.val && Objects.equals(next, listNode.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(val, next);
  }

  @Override
  public String toString() {
    if (next == null) {
      return String.valueOf(val);
    }

    return val + "->" + next;
  }
}

