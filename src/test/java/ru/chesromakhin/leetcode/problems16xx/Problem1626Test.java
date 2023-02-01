package ru.chesromakhin.leetcode.problems16xx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem1626Test {

  @Test
  void test1() {
    int score = new Problem1626().bestTeamScore(new int[]{1, 3, 7, 3, 2, 4, 10, 7, 5}, new int[]{4, 5, 2, 1, 1, 2, 4, 1, 4});

    assertEquals(29, score);
  }

  @Test
  void test2() {
    int score = new Problem1626().bestTeamScore(
      new int[]{596,277,897,622,500,299,34,536,797,32,264,948,645,537,83,589,770},
      new int[]{18,52,60,79,72,28,81,33,96,15,18,5,17,96,57,72,72}
    );

    assertEquals(3287, score);
  }

  @Test
  void test3() {
    int score = new Problem1626().bestTeamScore(new int[]{4,5,6,5}, new int[]{2,1,2,1});

    assertEquals(16, score);
  }

  @Test
  void testLong() {
    int score = new Problem1626().bestTeamScore(new int[]{578,642,51,642,753,775,817,833,524,134,704,18,989,328,512,6,589,823,641,354,190,178,875,446,231,419,228,406}, new int[]{79,13,9,30,6,22,62,91,82,75,54,44,14,87,78,89,39,81,33,25,64,21,24,81,55,26,85,86});

    assertEquals(4821, score);
  }
}