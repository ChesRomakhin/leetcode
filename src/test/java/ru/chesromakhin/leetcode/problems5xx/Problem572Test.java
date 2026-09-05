package ru.chesromakhin.leetcode.problems5xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import ru.chesromakhin.leetcode.utils.TreeNode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem572Test {

  static Stream<List<Object>> getCases() {
    return Stream.of(
      List.of(TreeNode.generateTree(Arrays.asList(3,4,5,1,2,null,null,null,null,0)), TreeNode.generateTree(Arrays.asList(4,1,2)), false),
      List.of(TreeNode.generateTree(Arrays.asList(3,4,5,1,2)), TreeNode.generateTree(Arrays.asList(4,1,2)), true),
      List.of(TreeNode.generateTree(Arrays.asList(1, 2, 1)), TreeNode.generateTree(Arrays.asList(1, 2, 1)), true)
    );
  }
  
  @ParameterizedTest
  @MethodSource("getCases")
  void isSubTree(List<Object> caseData) {
    assertEquals(caseData.getLast(), new Problem572().isSubtree((TreeNode) caseData.get(0), (TreeNode) caseData.get(1)));
  }

}