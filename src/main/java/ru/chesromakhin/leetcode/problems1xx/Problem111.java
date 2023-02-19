package ru.chesromakhin.leetcode.problems1xx;

import ru.chesromakhin.leetcode.utils.TreeNode;

import java.util.LinkedList;

public class Problem111 {

  public int minDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }

    LinkedList<TreeNode> currentLevel = new LinkedList<>();
    currentLevel.add(root);

    int depth = 1;
    while (!currentLevel.isEmpty()) {
      int n = currentLevel.size();

      for (int i = 0; i < n; i++) {
        TreeNode node = currentLevel.poll();

        if (node.left == null && node.right == null) {
          return depth;
        } else {
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

      depth++;
    }

    return depth;
  }

}
