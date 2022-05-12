package ru.chesromakhin.leetcode.problems0xx;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem47Test {

  @Test
  void permuteUnique() {
    List<List<Integer>> lists = new Problem47().permuteUnique(new int[]{1, 1, 2});

    System.out.println(lists.toString());
  }
}