package ru.chesromakhin.leetcode.problems1xx;

import java.util.ArrayList;
import java.util.List;

public class Problem117 {
  public Node connect(Node root) {
    if (root == null) {
      return null;
    }

    List<Node> currentLevel;
    List<Node> nextLevel = new ArrayList<>();
    nextLevel.add(root);

    do {
      currentLevel = nextLevel;
      nextLevel = new ArrayList<>();

      for (int i = 0; i < currentLevel.size() - 1; i++) {
        Node node = currentLevel.get(i);
        node.next = currentLevel.get(i + 1);

        if (node.left != null) {
          nextLevel.add(node.left);
        }

        if (node.right != null) {
          nextLevel.add(node.right);
        }
      }

      Node node = currentLevel.get(currentLevel.size() - 1);
      if (node.left != null) {
        nextLevel.add(node.left);
      }

      if (node.right != null) {
        nextLevel.add(node.right);
      }
    } while (!nextLevel.isEmpty());

    return root;
  }

}

class Node {
  public int val;
  public Node left;
  public Node right;
  public Node next;

  public Node() {}

  public Node(int val) {
    this.val = val;
  }

  public Node(int val, Node left, Node right, Node next) {
    this.val = val;
    this.left = left;
    this.right = right;
    this.next = next;
  }

  @Override
  public String toString() {
    StringBuilder s = new StringBuilder().append(this.val).append("[");

    if (left != null) {
      s.append(left);
    } else {
      s.append("#");
    }

    s.append(",");

    if (right != null) {
      s.append(right);
    } else {
      s.append("#");
    }

    s.append("]{");

    if (next != null) {
      s.append(next.val);
    } else {
      s.append("#");
    }

    return s.append("}").toString();
  }
};
