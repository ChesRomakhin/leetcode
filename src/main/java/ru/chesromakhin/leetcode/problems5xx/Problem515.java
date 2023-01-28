package ru.chesromakhin.leetcode.problems5xx;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Problem515 {

  public List<Integer> largestValues(TreeNode root) {
    if (root == null) {
      return Collections.emptyList();
    }

    List<Integer> result = new LinkedList<>();

    List<TreeNode> currentLevel = Collections.singletonList(root);
    while (!currentLevel.isEmpty()) {
      int max = currentLevel.get(0).val;

      List<TreeNode> nextLevel = new LinkedList<>();
      for (TreeNode treeNode : currentLevel) {
        max = Integer.max(max, treeNode.val);

        if (treeNode.left != null) {
          nextLevel.add(treeNode.left);
        }

        if (treeNode.right != null) {
          nextLevel.add(treeNode.right);
        }
      }

      result.add(max);
      currentLevel = nextLevel;
    }

    return result;
  }

}

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {
  }

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}
