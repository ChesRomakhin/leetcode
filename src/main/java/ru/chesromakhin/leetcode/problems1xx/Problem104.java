package ru.chesromakhin.leetcode.problems1xx;

import java.util.ArrayList;
import java.util.List;

public class Problem104 {

  public int maxDepth(TreeNode root) {
    int depth = 0;

    if (root == null) {
      return depth;
    }

    List<TreeNode> nodes = new ArrayList<>();
    nodes.add(root);

    while(!nodes.isEmpty()) {
      depth++;

      List<TreeNode> nextLevel = new ArrayList<>();
      for (TreeNode node : nodes) {
        if (node.left != null) {
          nextLevel.add(node.left);
        }

        if (node.right != null) {
          nextLevel.add(node.right);
        }
      }

      nodes = nextLevel;
    }

    return depth;
  }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
