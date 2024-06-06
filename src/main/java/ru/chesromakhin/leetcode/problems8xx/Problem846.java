package ru.chesromakhin.leetcode.problems8xx;

import java.util.Arrays;
import java.util.TreeMap;

/**
 * 846. Hand of Straights
 * Alice has some number of cards and she wants to rearrange the cards into groups so that each group is of size groupSize, and consists of groupSize consecutive cards.
 * Given an integer array hand where hand[i] is the value written on the ith card and an integer groupSize, return true if she can rearrange the cards, or false otherwise.
 */
public class Problem846 {

  public boolean isNStraightHand(int[] hand, int groupSize) {
    int length = hand.length;

    if (length % groupSize != 0) {
      return false;
    }

    if (groupSize == 1) {
      return true;
    }

    Arrays.sort(hand);

    for (int i = 0; i < length; i++) {
      int card = hand[i];

      if (card == -1) {
        continue;
      }

      hand[i] = -1;
      int start = i + 1;
      for (int j = 1; j < groupSize; j++) {
        boolean found = false;

        int nextCard = card + 1;
        for (int k = start; k < length; k++) {
          if (hand[k] == -1) {
            continue;
          }

          if (nextCard < hand[k]) {
            return false;
          }

          if (nextCard == hand[k]) {
            found = true;
            hand[k] = -1;
            start = k + 1;
            break;
          }
        }

        if (!found) {
          return false;
        }

        card = nextCard;
      }
    }

    return true;
  }

  public boolean isNStraightHand2(int[] hand, int groupSize) {
    int length = hand.length;

    if (length % groupSize != 0) {
      return false;
    }

    TreeMap<Integer, Integer> map = new TreeMap<>();
    for (int i : hand) {
      map.put(i, map.getOrDefault(i, 0) + 1);
    }

    while (!map.isEmpty()) {
      int start = map.firstKey();
      for (int i = 0; i < groupSize; i++) {
        if (!map.containsKey(start + i)) {
          return false;
        }

        var newCount = map.get(start + i) - 1;

        if (newCount == 0) {
          map.remove(start + i);
          continue;
        }

        map.put(start + i, newCount);
      }
    }

    return true;
  }

}
