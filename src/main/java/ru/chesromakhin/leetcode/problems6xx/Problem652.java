package ru.chesromakhin.leetcode.problems6xx;

import ru.chesromakhin.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem652 {

  private int last = 1;
  private final Map<String, Integer> trees = new HashMap<>();
  private final Map<Integer, Integer> counts = new HashMap<>();
  private final List<TreeNode> result = new ArrayList<>();

  public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
    lookup(root);
    return result;
  }

  private int lookup(TreeNode node) {
    if (node == null) {
      return 0;
    }

    String serial = node.val + "," + lookup(node.left) + "," + lookup(node.right);

    int uid = trees.computeIfAbsent(serial, x -> last++);

    Integer value = counts.compute(uid, (key, prev) -> {
      if (prev == null) {
        return 1;
      } else {
        return prev + 1;
      }
    });

    if (value == 2) {
      result.add(node);
    }

    return uid;
  }

}
