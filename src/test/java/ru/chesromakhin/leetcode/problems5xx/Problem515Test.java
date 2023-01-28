package ru.chesromakhin.leetcode.problems5xx;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Problem515Test {

  @Test
  void test1() {
    List<Integer> largestValues = new Problem515().largestValues(generateTree(Arrays.asList(1, 3, 2, 5, 3, null, 9)));

    Assertions.assertEquals(Arrays.asList(1,3,9), largestValues);
  }

  @Test
  void test2() {
    List<Integer> largestValues = new Problem515().largestValues(generateTree(Arrays.asList(1, 2, 3)));

    Assertions.assertEquals(Arrays.asList(1,3), largestValues);
  }

  @Test
  void test3() {
    List<Integer> largestValues = new Problem515().largestValues(generateTree(Arrays.asList(1)));

    Assertions.assertEquals(Arrays.asList(1), largestValues);
  }

  @Test
  void test4() {
    List<Integer> largestValues = new Problem515().largestValues(null);

    Assertions.assertEquals(Collections.emptyList(), largestValues);
  }

  private TreeNode generateTree(List<Integer> definition) {
    TreeNode root = new TreeNode(definition.get(0));
    List<TreeNode> prevLevel = new ArrayList<>();
    prevLevel.add(root);
    List<TreeNode> currentLevel = new ArrayList<>();

    int i = 1;
    while (i < definition.size()) {
      for (TreeNode node : prevLevel) {
        Integer left = definition.get(i++);
        if (left != null) {
          node.left = new TreeNode(left);
          currentLevel.add(node.left);
        }

        Integer right = definition.get(i++);
        if (right != null) {
          node.right = new TreeNode(right);
          currentLevel.add(node.right);
        }
      }

      prevLevel = currentLevel;
      currentLevel = new ArrayList<>();
    }

    return root;
  }

}