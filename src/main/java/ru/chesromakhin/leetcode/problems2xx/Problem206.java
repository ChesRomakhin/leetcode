package ru.chesromakhin.leetcode.problems2xx;

import java.util.Objects;

public class Problem206 {

  public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }

    ListNode root = head;
    while (head.next != null) {
      ListNode prevRoot = root;
      root = head.next;
      head.next = root.next;
      root.next = prevRoot;
    }

    return root;
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

    @Override
    public String toString() {
      if (next == null) {
        return val + "";
      }

      return val + "->" + next;
    }

  }

}
