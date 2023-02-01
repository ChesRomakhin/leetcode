package ru.chesromakhin.leetcode.problems16xx;

import java.util.*;
import java.util.stream.Collectors;

public class Problem1626 {

  private int findMaxScore(List<Player> players) {
    int playersCount = players.size();
    int maxScore = 0;

    int[] scores = new int[playersCount];
    for (int i = 0; i < playersCount; i++) {
      scores[i] = players.get(i).score;
      maxScore = Math.max(maxScore, scores[i]);
    }

    for (int i = 0; i < playersCount; i++) {
      Player playerA = players.get(i);
      for (int j = i - 1; j >= 0; j--) {
        Player playerB = players.get(j);
        if (playerA.score >= playerB.score) {
          scores[i] = Math.max(scores[i], playerA.score + scores[j]);
        }
      }

      maxScore = Math.max(maxScore, scores[i]);
    }

    return maxScore;
  }

  public int bestTeamScore(int[] scores, int[] ages) {
    int playersCount = ages.length;
    List<Player> players = new ArrayList<>(playersCount);

    for (int i = 0; i < playersCount; i++) {
      players.add(new Player(ages[i], scores[i]));
    }

    // Sort in ascending order of age and then by score.
    players.sort(Comparator.comparing(Player::getAge).thenComparing(Player::getScore));
    return findMaxScore(players);
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

class Problem1626SlowRecursive {

  public static final Comparator<Player> PLAYER_COMPARATOR =
    Comparator.comparing(Player::getAge)
      .thenComparing(Player::getScore)
      .thenComparing(Player::getIndex);

  private HashMap<Player, TreeSet<Player>> conflicts = new HashMap<>();
  private HashMap<Set<Player>, Integer> maxScores = new HashMap<>();
  private TreeSet<Player> allPlayers = new TreeSet<>(PLAYER_COMPARATOR);

  public int bestTeamScore(int[] scores, int[] ages) {
    for (int i = 0; i < ages.length; i++) {
      allPlayers.add(new Player(ages[i], scores[i], i));
    }

    TreeSet<Player> p = new TreeSet<>(PLAYER_COMPARATOR);
    p.addAll(allPlayers);

    return findMaxScore(p, 0);
  }

  private int findMaxScore(TreeSet<Player> players, int sum) {
    if (players.isEmpty()) {
      return sum;
    }

    if (maxScores.containsKey(players)) {
      return maxScores.get(players);
    }

    int max = sum;
    for (Player player : players) {
      TreeSet<Player> notConflictedPlayers = this.eliminateConflicts(player, players);

      int score = findMaxScore(notConflictedPlayers, sum + player.score);
      if (score > max) {
        max = score;
      }
    }

    maxScores.put(players, max);

    return max;
  }

  private TreeSet<Player> eliminateConflicts(Player player, TreeSet<Player> players) {
    TreeSet<Player> notConflicted = new TreeSet<>(PLAYER_COMPARATOR);
    notConflicted.addAll(players);
    notConflicted.remove(player);

    if (!conflicts.containsKey(player)) {
      TreeSet<Player> conflicted = allPlayers.stream()
        .filter(p -> (p.age > player.age && p.score < player.score) || (p.age < player.age && p.score > player.score))
        .collect(Collectors.toCollection(() -> new TreeSet<>(PLAYER_COMPARATOR)));
      conflicts.put(player, conflicted);
    }

    notConflicted.removeAll(conflicts.get(player));
    return notConflicted;
  }

  private static class Player {

    private final int age;
    private final int score;
    private final int index;

    public Player(int age, int score, int index) {
      this.age = age;
      this.score = score;
      this.index = index;
    }

    public int getAge() {
      return age;
    }

    public int getScore() {
      return score;
    }

    public int getIndex() {
      return index;
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