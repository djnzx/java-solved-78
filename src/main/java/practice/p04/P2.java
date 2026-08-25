package practice.p04;

// medium
// https://leetcode.com/problems/bitwise-and-of-numbers-range/
public class P2 {
  public int rangeBitwiseAnd(int left, int right) {
    int shift = 0;
    while (left < right) {
      left >>= 1;
      right >>= 1;
      shift++;
    }
    return left << shift;
  }
}
