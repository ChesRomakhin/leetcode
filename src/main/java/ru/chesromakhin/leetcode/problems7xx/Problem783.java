package ru.chesromakhin.leetcode.problems7xx;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem783 {

  public int minDiffInBST(TreeNode root) {
    Queue<TreeNode> treeNodes = new LinkedList<>();
    treeNodes.add(root);

    List<Integer> integers = new ArrayList<>();

    int minDistance = Integer.MAX_VALUE;
    while (!treeNodes.isEmpty()) {
      TreeNode current = treeNodes.poll();
      int val = current.val;

      TreeNode left = current.left;
      if (left != null) {
        treeNodes.add(left);
      }

      TreeNode right = current.right;
      if (right != null) {
        treeNodes.add(right);
      }

      integers.add(val);
    }

    integers.sort(Integer::compareTo);
    for (int i = 1; i < integers.size(); i++) {
      minDistance = Math.min(minDistance, integers.get(i) - integers.get(i - 1));
    }

    return minDistance;
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
