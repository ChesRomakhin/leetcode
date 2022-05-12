package ru.chesromakhin.leetcode.problems0xx;

import java.util.*;

public class Problem47 {

  /**
   * bruteforce solution
   */
  public List<List<Integer>> permuteUnique(int[] nums) {
    List<Integer> a = new ArrayList<>();
    for (int num : nums) {
      a.add(num);
    }

    Set<List<Integer>> result = generatePermutations(a);

    return new ArrayList<>(result);
  }

  public Set<List<Integer>> generatePermutations(List<Integer> numbers) {
    HashSet<List<Integer>> result = new HashSet<>();
    if (numbers.size() == 1) {
      result.add(numbers);
      return result;
    }

    for (int i = 0; i < numbers.size(); i++) {
      Integer number = numbers.get(i);

      List<Integer> rest = new ArrayList<>(numbers);
      rest.remove(i);

      Set<List<Integer>> permutations = generatePermutations(rest);
      permutations.forEach(integers -> integers.add(number));

      result.addAll(permutations);
    }

    return result;
  }

}
