package ru.chesromakhin.leetcode.problems0xx;

import java.util.ArrayList;
import java.util.List;

/**
 * Zigzag Conversion
 * <br/>
 * "PAYPALISHIRING"
 * ->
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * ->
 * "PAHNAPLSIIGYIR"
 */
public class Problem6 {

  public String convert(String s, int numRows) {
    if (numRows >= s.length() || numRows == 1) {
      return s;
    }

    int l = numRows + numRows - 2;

    List<StringBuilder> rows = new ArrayList<>(numRows);
    for (int i = 0; i < numRows; i++) {
      rows.add(new StringBuilder());
    }

    for (int i = 0; i < s.length(); i++) {
      int row = i % l;

      if (row >= numRows) {
        row = l - row;
      }

      rows.get(row).append(s.charAt(i));
    }

    StringBuilder result = new StringBuilder();
    for (int i = 0; i < rows.size(); i++) {
      result.append(rows.get(i).toString());
    }

    return result.toString();
  }

}
