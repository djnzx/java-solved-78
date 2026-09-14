package practice.p09;

// medium
// https://leetcode.com/problems/zigzag-conversion/
public class P2 {
  public String convert(String s, int numRows) {
    if (numRows == 1) {
      return s;
    }
    StringBuilder[] rows = new StringBuilder[numRows];
    for (int i = 0; i < numRows; i++) {
      rows[i] = new StringBuilder();
    }

    int row = 0;
    int step = 1;
    for (int i = 0; i < s.length(); i++) {
      rows[row].append(s.charAt(i));
      if (row == 0) {
        step = 1;
      } else if (row == numRows - 1) {
        step = -1;
      }
      row += step;
    }

    StringBuilder result = new StringBuilder();
    for (StringBuilder rowText : rows) {
      result.append(rowText);
    }
    return result.toString();
  }
}
