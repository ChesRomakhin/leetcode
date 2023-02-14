package ru.chesromakhin.leetcode.problems24xx;

import java.util.*;

public class Problem2477 {

  private int seats;
  private long fuel = 0;
  private final Map<Integer, List<Integer>> roads = new HashMap<>();

  public long depthFirstSearch(int node, int parent) {
    int representatives = 1;

    if (!roads.containsKey(node)) {
      return 1;
    }

    for (int child : roads.get(node)) {
      if (child != parent) {
        representatives += depthFirstSearch(child, node);
      }
    }

    if (node != 0) {
      fuel += Math.ceil((double) representatives / seats);
    }

    return representatives;
  }

  public long minimumFuelCost(int[][] roads, int seats) {
    this.seats = seats;

    for (int[] road : roads) {
      this.roads.computeIfAbsent(road[0], k -> new ArrayList<>()).add(road[1]);
      this.roads.computeIfAbsent(road[1], k -> new ArrayList<>()).add(road[0]);
    }

    depthFirstSearch(0, -1);

    return fuel;
  }

}
