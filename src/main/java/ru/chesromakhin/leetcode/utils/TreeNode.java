package ru.chesromakhin.leetcode.utils;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
  public int val;
  public TreeNode left;
  public TreeNode right;

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

  @Override
  public String toString() {
    return this.val + "";
  }

  public static TreeNode generateTree(List<Integer> definition) {
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
