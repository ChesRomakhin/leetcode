package ru.chesromakhin.leetcode.problems5xx;

import java.util.*;

public class Problem502 {

  record Project(
    int profit,
    int capital
  ) {}

  public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
    List<Project> projects = new ArrayList<>();

    for (int i = 0; i < profits.length; i++) {
      projects.add(new Project(profits[i], capital[i]));
    }

    projects.sort(Comparator.comparing(Project::profit));

    int currentCapital = w;
    for (int i = 0; i < k; i++) {
      if (projects.isEmpty()) {
        break;
      }

      int l = -1;
      for (int j = projects.size() - 1; j >= 0; j--) {
        if (projects.get(j).capital <= currentCapital) {
          l = j;
          break;
        }
      }

      if (l == -1) {
        break;
      }

      Project project = projects.get(l);
      currentCapital += project.profit();

      projects.remove(l);
    }

    return currentCapital;
  }

}
