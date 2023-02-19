package ru.chesromakhin.leetcode.problems1xx;

import org.junit.jupiter.api.Test;
import ru.chesromakhin.leetcode.utils.TreeNode;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem103Test {

  @Test
  void test0() {
    assertEquals(
      List.of(List.of(3), List.of(20, 9), List.of(15, 7)),
      new Problem103().zigzagLevelOrder(
        TreeNode.generateTree(Arrays.asList(3, 9, 20, null, null, 15, 7))
      )
    );
  }

  @Test
  void test1() {
    assertEquals(
      List.of(List.of(3), List.of(20, 9), List.of(1, 2, 15, 7), List.of(45, 23, 11, 5, 6, 7, 8, 9)),
      new Problem103().zigzagLevelOrder(
        TreeNode.generateTree(Arrays.asList(3, 9, 20, 1, 2, 15, 7, 9, 8, 7, 6, 5, 11, 23, 45))
      )
    );
  }

}