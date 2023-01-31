package ru.chesromakhin.leetcode.problems16xx;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.stream.Collectors;

public class Problem1626 {

  private HashMap<Player, List<Player>> conflicts = new HashMap<>();
  private HashMap<Set<Player>, Integer> maxScores = new HashMap<>();
  private List<Player> allPlayers = new LinkedList<>();

  public int bestTeamScore(int[] scores, int[] ages) {
    for (int i = 0; i < ages.length; i++) {
      allPlayers.add(new Player(ages[i], scores[i]));
    }

    return findMaxScore(new LinkedList<>(allPlayers), 0);
  }

  private int findMaxScore(List<Player> players, int sum) {
    if (players.isEmpty()) {
      return sum;
    }

    TreeSet<Player> p = new TreeSet<>(Comparator.comparing(Player::getScore).thenComparing(Player::getAge));
    p.addAll(players);

    if (maxScores.containsKey(p)) {
      return maxScores.get(p);
    }

    int max = sum;
    for (Player player : players) {
      List<Player> notConflictedPlayers = this.eliminateConflicts(player, players);

      int score = findMaxScore(notConflictedPlayers, sum + player.score);
      if (score > max) {
        max = score;
      }
    }

    maxScores.put(p, max);

    return max;
  }

  private List<Player> eliminateConflicts(Player player, List<Player> players) {
    List<Player> notConflicted = new LinkedList<>(players);
    notConflicted.remove(player);

    if (!conflicts.containsKey(player)) {
      List<Player> conflicted = allPlayers.stream()
        .filter(p -> (p.age > player.age && p.score < player.score) || (p.age < player.age && p.score > player.score))
        .collect(Collectors.toList());
      conflicts.put(player, conflicted);
    }

    notConflicted.removeAll(conflicts.get(player));
    return notConflicted;
  }

  private static class Player {

    private final int age;
    private final int score;

    public Player(int age, int score) {
      this.age = age;
      this.score = score;
    }

    public int getAge() {
      return age;
    }

    public int getScore() {
      return score;
    }

    @Override
    public String toString() {
      return "Player{" +
        "age=" + age +
        ", score=" + score +
        '}';
    }
  }

}

class SolutionBottomUpDynamicProgramming {
  private int findMaxScore(int[][] ageScorePair) {
    int n = ageScorePair.length;
    int answer = 0;

    int[] dp = new int[n];
    // Initially, the maximum score for each player will be equal to the individual scores.
    for (int i = 0; i < n; i++) {
      dp[i] = ageScorePair[i][1];
      answer = Math.max(answer, dp[i]);
    }

    for (int i = 0; i < n; i++) {
      for (int j = i - 1; j >= 0; j--) {
        // If the players j and i could be in the same team.
        if (ageScorePair[i][1] >= ageScorePair[j][1]) {
          // Update the maximum score for the ith player.
          dp[i] = Math.max(dp[i], ageScorePair[i][1] + dp[j]);
        }
      }
      // Maximum score among all the players.
      answer = Math.max(answer, dp[i]);
    }

    return answer;
  }

  public int bestTeamScore(int[] scores, int[] ages) {
    int N = ages.length;
    int[][] ageScorePair = new int[N][2];

    for (int i = 0; i < N; i++) {
      ageScorePair[i][0] = ages[i];
      ageScorePair[i][1] = scores[i];
    }

    // Sort in ascending order of age and then by score.
    Arrays.sort(ageScorePair, (a,b) -> a[0] == b[0] ? a[1]-b[1] : a[0]-b[0]);
    return findMaxScore(ageScorePair);
  }
}
