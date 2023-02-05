package ru.chesromakhin.leetcode.problems1xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem141Test {

  static Stream<Problem141.ListNode> getTrueCases() {
    return Stream.of(
      createCycledList(1, 2, 3, 4, 1),
      createCycledList(1, 2, 3, 4, 0),
      createCycledList(1, 2, 3, 4, 2)
    );
  }

  static Stream<Problem141.ListNode> getFalseCases() {
    return Stream.of(
      createList(1, 2, 3, 4),
      createList(4, 3, 2, 1),
      createList(1),
      null
    );
  }

  @ParameterizedTest
  @MethodSource("getTrueCases")
  void testForTrue(Problem141.ListNode node) {
    assertTrue(new Problem141().hasCycle(node));
  }

  @ParameterizedTest
  @MethodSource("getFalseCases")
  void testForFalse(Problem141.ListNode node) {
    assertFalse(new Problem141().hasCycle(node));
  }

  private static Problem141.ListNode createList(int... numbers) {
    Problem141.ListNode head = new Problem141.ListNode(numbers[0]);
    Problem141.ListNode tail = head.next;

    for (int i = 1; i < numbers.length; i++) {
      if (tail == null) {
        tail = new Problem141.ListNode(numbers[i]);
        head.next = tail;
      } else {
        tail.next = new Problem141.ListNode(numbers[i]);
        tail = tail.next;
      }
    }

    return head;
  }

  private static Problem141.ListNode createCycledList(int... numbers) {
    Problem141.ListNode head = new Problem141.ListNode(numbers[0]);
    Problem141.ListNode tail = head.next;

    int cycleIndex = numbers[numbers.length - 1];
    Problem141.ListNode cycleNode = head;

    for (int i = 1; i < numbers.length - 1; i++) {
      if (tail == null) {
        tail = new Problem141.ListNode(numbers[i]);
        head.next = tail;
      } else {
        tail.next = new Problem141.ListNode(numbers[i]);
        tail = tail.next;
      }

      if (i == cycleIndex) {
        cycleNode = tail;
      }
    }

    tail.next = cycleNode;

    return head;
  }

}