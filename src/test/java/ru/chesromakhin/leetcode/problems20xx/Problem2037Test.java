package ru.chesromakhin.leetcode.problems20xx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem2037Test {

  record CaseData(
    int[] seats,
    int[] students,
    int moves
  ) {
  }

  static Stream<CaseData> getCases() {
    return Stream.of(
      new CaseData(new int[]{2}, new int[]{2}, 0),
      new CaseData(new int[]{3,1,5}, new int[]{2,7,4}, 4),
      new CaseData(new int[]{4,1,5,9}, new int[]{1,3,2,6}, 7),
      new CaseData(new int[]{2,2,6,6}, new int[]{1,3,2,6}, 4)
    );
  }

  @ParameterizedTest
  @MethodSource("getCases")
  void testSolution(CaseData caseData) {
    assertEquals(caseData.moves, new Problem2037().minMovesToSeat(caseData.seats, caseData.students));
  }

}