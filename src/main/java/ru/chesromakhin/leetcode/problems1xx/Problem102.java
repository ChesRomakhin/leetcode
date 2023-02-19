package ru.chesromakhin.leetcode.problems1xx;

import ru.chesromakhin.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Problem102 {

  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();

    if (root == null) {
      return result;
    }

    LinkedList<TreeNode> currentLevel = new LinkedList<>();
    currentLevel.add(root);

    while (!currentLevel.isEmpty()) {
      int n = currentLevel.size();
      List<Integer> level = new ArrayList<>(n);
      result.add(level);

      for (int i = 0; i < n; i++) {
        TreeNode node = currentLevel.poll();
        level.add(node.val);

        TreeNode left = node.left;
        if (left != null) {
          currentLevel.add(left);
        }

        TreeNode right = node.right;
        if (right != null) {
          currentLevel.add(right);
        }
      }
    }

    return result;
  }

}
