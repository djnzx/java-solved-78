package practice.p04;

// base
// https://leetcode.com/problems/single-number/
public class P1 {
  public int singleNumber(int[] nums) {
    int result = 0;
    for (int num : nums) {
      result ^= num;
    }
    return result;
  }
}
