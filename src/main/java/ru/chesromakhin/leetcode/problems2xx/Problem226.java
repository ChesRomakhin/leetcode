package ru.chesromakhin.leetcode.problems2xx;

import java.util.LinkedList;
import java.util.Queue;

public class Problem226 {

  public TreeNode invertTree(TreeNode root) {
    if (root == null || (root.left == null && root.right == null)) {
      return root;
    }

    Queue<TreeNode> nodes = new LinkedList<>();
    nodes.add(root);

    while (!nodes.isEmpty()) {
      TreeNode node = nodes.poll();

      TreeNode a = node.left;
      node.left = node.right;
      node.right = a;

      if (node.left != null) {
        nodes.add(node.left);
      }

      if (node.right != null) {
        nodes.add(node.right);
      }
    }

    return root;
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
