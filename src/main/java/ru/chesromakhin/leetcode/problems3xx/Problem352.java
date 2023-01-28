package ru.chesromakhin.leetcode.problems3xx;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Problem352 {

  public static void main(String[] args) {
    SummaryRanges summaryRanges = new SummaryRanges();
    summaryRanges.addNum(1);
    System.out.println(Arrays.stream(summaryRanges.getIntervals()).map(Arrays::toString).collect(Collectors.joining(",")));
    summaryRanges.addNum(3);
    System.out.println(Arrays.stream(summaryRanges.getIntervals()).map(Arrays::toString).collect(Collectors.joining(",")));
    summaryRanges.addNum(7);
    System.out.println(Arrays.stream(summaryRanges.getIntervals()).map(Arrays::toString).collect(Collectors.joining(",")));
    summaryRanges.addNum(2);
    System.out.println(Arrays.stream(summaryRanges.getIntervals()).map(Arrays::toString).collect(Collectors.joining(",")));
    summaryRanges.addNum(6);
    System.out.println(Arrays.stream(summaryRanges.getIntervals()).map(Arrays::toString).collect(Collectors.joining(",")));
  }

}

/**
 * Your SummaryRanges object will be instantiated and called as such:
 * SummaryRanges obj = new SummaryRanges();
 * obj.addNum(value);
 * int[][] param_2 = obj.getIntervals();
 */
class SummaryRanges {

  private int[][] intervals;
  private int[] array;

  public SummaryRanges() {
    this.array = new int[0];
    intervals = new int[0][];
  }

  public void addNum(int value) {
    if (array.length == 0) {
      array = new int[]{value};
      this.intervals = new int[][]{{value, value}};
    }

    if (value == this.array[0]) {
      return;
    }

    int[] newArray = new int[array.length + 1];
    if (value < array[0]) {
      newArray[0] = value;
      System.arraycopy(array, 0, newArray, 1, array.length);
      this.array = newArray;
      this.intervals = null;
      return;
    }

    if (value > array[array.length - 1]) {
      System.arraycopy(array, 0, newArray, 0, array.length);
      newArray[array.length] = value;
      this.array = newArray;
      this.intervals = null;
      return;
    }

    for (int i = 1; i < array.length; i++) {
      if (value == array[i]) {
        return;
      }

      if (value > array[i - 1] && value < array[i]) {
        System.arraycopy(array, 0, newArray, 0, i);
        newArray[i] = value;
        System.arraycopy(array, i, newArray, i + 1, array.length - i);
        this.array = newArray;
        this.intervals = null;
        return;
      }

      newArray[i] = array[i];
    }
  }

  public int[][] getIntervals() {
    if (intervals != null) {
      return intervals;
    }

    int[][] newIntervals = new int[this.array.length][];
    int lastIntervalIndex = 0;

    newIntervals[0] = new int[]{array[0], array[0]};

    for (int i = 1; i < this.array.length; i++) {
      if (array[i] - 1 > newIntervals[lastIntervalIndex][1]) {
        newIntervals[++lastIntervalIndex] = new int[]{array[i], array[i]};
      } else {
        newIntervals[lastIntervalIndex][1] = array[i];
      }
    }

    this.intervals = new int[lastIntervalIndex + 1][];
    System.arraycopy(newIntervals, 0, this.intervals, 0, lastIntervalIndex + 1);

    return this.intervals;
  }

}