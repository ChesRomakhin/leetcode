package ru.chesromakhin.leetcode.problems1xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import ru.chesromakhin.leetcode.utils.TreeNode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem100Test {

  static Stream<List<Object>> getCases() {
    return Stream.of(
      List.of(TreeNode.generateTree(Arrays.asList(1, 2, 3)), TreeNode.generateTree(Arrays.asList(1, 2, 3)), true),
      List.of(TreeNode.generateTree(Arrays.asList(1, 2, null)), TreeNode.generateTree(Arrays.asList(1, null, 3)), false),
      List.of(TreeNode.generateTree(Arrays.asList(1, 2, 1)), TreeNode.generateTree(Arrays.asList(1, 1, 2)), false)
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void isSameTree(List<Object> caseData) {
    assertEquals(caseData.getLast(), new Problem100().isSameTree((TreeNode) caseData.get(0), (TreeNode) caseData.get(1)));
  }
}