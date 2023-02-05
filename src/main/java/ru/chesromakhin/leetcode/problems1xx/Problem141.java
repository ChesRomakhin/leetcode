package ru.chesromakhin.leetcode.problems1xx;

import java.util.Objects;

public class Problem141 {

  public boolean hasCycle(ListNode head) {
    if (head == null || head.next == null) {
      return false;
    }

    if (head.next == head) {
      return true;
    }

    ListNode n1 = head;
    ListNode n2 = head;

    do {
      n1 = n1.next;
      if (n1 == null) {
        return false;
      }

      n2 = n2.next;
      if (n2 == null) {
        return false;
      }

      n2 = n2.next;
      if (n2 == null) {
        return false;
      }
    } while (n1 != n2);

    return true;
  }

  public static class ListNode {
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
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }

      ListNode listNode = (ListNode) o;
      return val == listNode.val && (next == listNode.next || next.equals(listNode.next));
    }

    @Override
    public int hashCode() {
      return Objects.hash(val, next);
    }

  }

}
