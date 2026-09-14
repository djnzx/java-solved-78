package practice.p13;

// medium
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class P2 {
  public int[] searchRange(int[] nums, int target) {
    int first = lowerBound(nums, target);
    if (first == nums.length || nums[first] != target) {
      return new int[] {-1, -1};
    }
    return new int[] {first, lowerBound(nums, target + 1) - 1};
  }

  private int lowerBound(int[] nums, int target) {
    int low = 0;
    int high = nums.length;
    while (low < high) {
      int mid = (low + high) >>> 1;
      if (nums[mid] < target) {
        low = mid + 1;
      } else {
        high = mid;
      }
    }
    return low;
  }
}
