package practice.p08;

// base
// https://leetcode.com/problems/find-pivot-index/
public class P1 {
  public int pivotIndex(int[] nums) {
    int total = 0;
    for (int num : nums) {
      total += num;
    }
    int leftSum = 0;
    for (int i = 0; i < nums.length; i++) {
      if (leftSum == total - leftSum - nums[i]) {
        return i;
      }
      leftSum += nums[i];
    }
    return -1;
  }
}
