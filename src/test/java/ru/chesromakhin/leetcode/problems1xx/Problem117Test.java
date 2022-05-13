package ru.chesromakhin.leetcode.problems1xx;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem117Test {

  @Test
  void connect() {
    Node node = generateTree(Arrays.asList(1, 2, 3, 4, 5, null, 7));

    System.out.println(node);

    Node connect = new Problem117().connect(node);

    System.out.println(connect);
  }

  private Node generateTree(List<Integer> definition) {
    Node root = new Node(definition.get(0));
    List<Node> prevLevel = new ArrayList<>();
    prevLevel.add(root);
    List<Node> currentLevel = new ArrayList<>();

    int i = 1;
    while (i < definition.size()) {
      for (Node node : prevLevel) {
        Integer left = definition.get(i++);
        if (left != null) {
          node.left = new Node(left);
          currentLevel.add(node.left);
        }

        Integer right = definition.get(i++);
        if (right != null) {
          node.right = new Node(right);
          currentLevel.add(node.right);
        }
      }

      prevLevel = currentLevel;
      currentLevel = new ArrayList<>();
    }

    return root;
  }
}