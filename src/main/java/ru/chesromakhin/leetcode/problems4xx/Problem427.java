package ru.chesromakhin.leetcode.problems4xx;

public class Problem427 {

  int[][] grid;
  int n;

  public Node construct(int[][] grid) {
    this.grid = grid;
    this.n = grid.length;

    return constructInner(0, n, 0, n);
  }

  private Node constructInner(int x1, int x2, int y1, int y2) {
    if (x2 - x1 == 1) {
      return new Node(grid[y1][x1] == 1, true);
    }

    int xmid = (x2 + x1) >> 1;
    int ymid = (y2 + y1) >> 1;
    Node a = constructInner(x1, xmid, y1, ymid);
    Node b = constructInner(xmid, x2, y1, ymid);
    Node c = constructInner(x1, xmid, ymid, y2);
    Node d = constructInner(xmid, x2, ymid, y2);

    if (a.isLeaf && b.isLeaf && c.isLeaf && d.isLeaf && a.val == b.val && b.val == c.val && c.val == d.val) {
      return new Node(grid[y1][x1] == 1, true);
    } else {
      return new Node(false, false, a, b, c, d);
    }
  }

}

class Node {
  public boolean val;
  public boolean isLeaf;
  public Node topLeft;
  public Node topRight;
  public Node bottomLeft;
  public Node bottomRight;


  public Node() {
    this.val = false;
    this.isLeaf = false;
    this.topLeft = null;
    this.topRight = null;
    this.bottomLeft = null;
    this.bottomRight = null;
  }

  public Node(boolean val, boolean isLeaf) {
    this.val = val;
    this.isLeaf = isLeaf;
    this.topLeft = null;
    this.topRight = null;
    this.bottomLeft = null;
    this.bottomRight = null;
  }

  public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
    this.val = val;
    this.isLeaf = isLeaf;
    this.topLeft = topLeft;
    this.topRight = topRight;
    this.bottomLeft = bottomLeft;
    this.bottomRight = bottomRight;
  }
}
