package ru.chesromakhin.leetcode.problems0xx;

public class Problem21 {

  public static void main(String[] args) {
    System.out.println(new Solution().mergeTwoLists(
      new ListNode(1, new ListNode(2, new ListNode(4))),
      new ListNode(1, new ListNode(3, new ListNode(4)))
    ));

    System.out.println(new Solution().mergeTwoLists(
      null,
      new ListNode(1, new ListNode(3, new ListNode(4)))
    ));

    System.out.println(new Solution().mergeTwoLists(
      new ListNode(1, new ListNode(3, new ListNode(4))),
      null
    ));
  }

}

class ListNode {
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
  public String toString() {
    if (next == null) {
      return val + "";
    }

    return val + "," + next.toString();
  }
}

class Solution {

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 == null) {
      return list2;
    }

    if (list2 == null) {
      return list1;
    }

    ListNode a = list1;
    ListNode b = list2;

    ListNode root;

    if (a.val < b.val) {
      root = a;
      a = a.next;
    } else {
      root = b;
      b = b.next;
    }
    root.next = null;
    ListNode current = root;

    while (a != null && b != null) {
      if (a.val < b.val) {
        current.next = a;
        a = a.next;
      } else {
        current.next = b;
        b = b.next;
      }

      current = current.next;
      current.next = null;
    }

    if (a != null) {
      current.next = a;
    }

    if (b != null) {
      current.next = b;
    }

    return root;
  }

}
