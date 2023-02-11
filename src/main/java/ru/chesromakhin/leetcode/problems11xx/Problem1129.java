package ru.chesromakhin.leetcode.problems11xx;

import java.util.*;

public class Problem1129 {

  public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
    Map<Integer, List<List<Integer>>> adj = new HashMap<>();
    for (int[] redEdge : redEdges) {
      adj.computeIfAbsent(redEdge[0], k -> new ArrayList<List<Integer>>()).add(
        Arrays.asList(redEdge[1], 0));
    }

    for (int[] blueEdge : blueEdges) {
      adj.computeIfAbsent(blueEdge[0], k -> new ArrayList<List<Integer>>()).add(
        Arrays.asList(blueEdge[1], 1));
    }

    int[] answer = new int[n];
    Arrays.fill(answer, -1);
    boolean[][] visit = new boolean[n][2];
    Queue<int[]> q = new LinkedList<>();

    // Start with node 0, with number of steps as 0 and undefined color -1.
    q.offer(new int[]{0, 0, -1});
    answer[0] = 0;
    visit[0][1] = visit[0][0] = true;

    while (!q.isEmpty()) {
      int[] element = q.poll();
      int node = element[0], steps = element[1], prevColor = element[2];

      if (!adj.containsKey(node)) {
        continue;
      }

      for (List<Integer> nei : adj.get(node)) {
        int neighbor = nei.get(0);
        int color = nei.get(1);
        if (!visit[neighbor][color] && color != prevColor) {
          if (answer[neighbor] == -1)
            answer[neighbor] = 1 + steps;
          visit[neighbor][color] = true;
          q.offer(new int[]{neighbor, 1 + steps, color});
        }
      }
    }
    return answer;
  }

}

class Problem1129Slow {

  public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
    Map<Integer, Set<Integer>> red = new HashMap<>();
    Map<Integer, Set<Integer>> blue = new HashMap<>();

    for (int i = 0; i < n; i++) {
      red.put(i, new TreeSet<>());
      blue.put(i, new TreeSet<>());
    }

    for (int[] redEdge : redEdges) {
      red.get(redEdge[0]).add(redEdge[1]);
    }

    for (int[] blueEdge : blueEdges) {
      blue.get(blueEdge[0]).add(blueEdge[1]);
    }

    int[] result = new int[n];
    result[0] = 0;

    if (n == 1) {
      return result;
    }

    int[] redResult = new int[n];
    Arrays.fill(redResult, -1);
    redResult[0] = 0;
    boolean[] redVisited = new boolean[n];
    redVisited[0] = true;
    iterate(0, red, blue, redResult, new boolean[n][n], new boolean[n][n], 1);

    int[] blueResult = new int[n];
    Arrays.fill(blueResult, -1);
    blueResult[0] = 0;
    boolean[] blueVisited = new boolean[n];
    blueVisited[0] = true;
    iterate(0, blue, red, blueResult, new boolean[n][n], new boolean[n][n], 1);

    for (int i = 1; i < n; i++) {
      result[i] = -1;

      if (redResult[i] != -1) {
        result[i] = redResult[i];
      }

      if (blueResult[i] != -1) {
        if (result[i] != -1) {
          result[i] = Math.min(blueResult[i], result[i]);
        } else {
          result[i] = blueResult[i];
        }
      }
    }

    return result;
  }

  private void iterate(int prevNode, Map<Integer, Set<Integer>> current, Map<Integer, Set<Integer>> next, int[] paths, boolean[][] visitedCurrent, boolean[][] visitedNext, int iteration) {
    Set<Integer> links = current.get(prevNode);
    if (links.isEmpty()) {
      return;
    }

    for (Integer link : links) {
      if (!visitedCurrent[prevNode][link]) {
        if (paths[link] == -1) {
          paths[link] = iteration;
        } else {
          paths[link] = Math.min(iteration, paths[link]);
        }
      }
    }

    for (Integer link : links) {
      if (!visitedCurrent[prevNode][link]) {
        visitedCurrent[prevNode][link] = true;
        iterate(link, next, current, paths, copy(visitedNext), copy(visitedCurrent), iteration + 1);
      }
    }
  }

  private boolean[][] copy(boolean[][] arr) {
    return Arrays.stream(arr).map(boolean[]::clone).toArray(boolean[][]::new);
  }

}
