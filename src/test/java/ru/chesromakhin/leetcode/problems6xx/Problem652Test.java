package ru.chesromakhin.leetcode.problems6xx;

import org.junit.jupiter.api.Test;
import ru.chesromakhin.leetcode.utils.TreeNode;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem652Test {

  @Test
  void test0() {
    List<TreeNode> duplicateSubtrees = new Problem652().findDuplicateSubtrees(TreeNode.generateTree(List.of(2, 1, 1)));

    assertEquals(1, duplicateSubtrees.get(0).val);
  }

  @Test
  void test1() {
    List<TreeNode> duplicateSubtrees = new Problem652().findDuplicateSubtrees(TreeNode.generateTree(Arrays.asList(0,0,0,0,null,null,0,null,null,null,0)));
  }

}