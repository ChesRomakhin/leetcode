package ru.chesromakhin.leetcode.problems2xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem206Test {

  static Stream<List<Problem206.ListNode>> getCases() {
    return Stream.of(
      Arrays.asList(createList(1, 2, 3, 4), createList(4, 3, 2, 1)),
      Arrays.asList(new Problem206.ListNode(1), new Problem206.ListNode(1)),
      Arrays.asList(null, null)
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void testSolution(List<Problem206.ListNode> caseData) {
    assertEquals(caseData.get(1), new Problem206().reverseList(caseData.get(0)));
  }

  private static Problem206.ListNode createList(int... numbers) {
    Problem206.ListNode head = new Problem206.ListNode(numbers[0]);
    Problem206.ListNode tail = head.next;

    for (int i = 1; i < numbers.length; i++) {
      if (tail == null) {
        tail = new Problem206.ListNode(numbers[i]);
        head.next = tail;
      } else {
        tail.next = new Problem206.ListNode(numbers[i]);
        tail = tail.next;
      }
    }

    return head;
  }

}