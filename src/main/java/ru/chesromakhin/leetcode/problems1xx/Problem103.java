package ru.chesromakhin.leetcode.problems1xx;

import ru.chesromakhin.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Problem103 {

  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();

    if (root == null) {
      return result;
    }

    List<TreeNode> currentLevel = Collections.singletonList(root);

    boolean rtl = true;

    while (!currentLevel.isEmpty()) {
      LinkedList<Integer> level = new LinkedList<>();
      result.add(level);

      List<TreeNode> nextLevel = new ArrayList<>();

      for (int i = 0; i < currentLevel.size(); i++) {
        TreeNode node = currentLevel.get(i);

        if (rtl) {
          level.add(node.val);
        } else {
          level.addFirst(node.val);
        }

        if (node.left != null) {
          nextLevel.add(node.left);
        }

        if (node.right != null) {
          nextLevel.add(node.right);
        }
      }

      rtl = !rtl;
      currentLevel = nextLevel;
    }

    return result;
  }

}
