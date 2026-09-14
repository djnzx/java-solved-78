package practice.p10;

import java.util.ArrayList;
import java.util.List;

// medium
// https://leetcode.com/problems/subsets/
public class P2 {
  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    collect(nums, 0, new ArrayList<>(), result);
    return result;
  }

  private void collect(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
    result.add(new ArrayList<>(current));
    for (int i = start; i < nums.length; i++) {
      current.add(nums[i]);
      collect(nums, i + 1, current, result);
      current.removeLast();
    }
  }
}
