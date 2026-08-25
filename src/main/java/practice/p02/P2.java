package practice.p02;

// medium
// https://leetcode.com/problems/count-total-number-of-colored-cells/
public class P2 {
  public long coloredCells(int n) {
    return 2L * n * n - 2L * n + 1;
  }
}
