package practice.p11;

import java.util.HashMap;
import java.util.Map;

// medium
// https://leetcode.com/problems/subarray-sum-equals-k/
public class P2 {
  public int subarraySum(int[] nums, int k) {
    Map<Integer, Integer> prefixCounts = new HashMap<>();
    prefixCounts.put(0, 1);

    int sum = 0;
    int result = 0;
    for (int num : nums) {
      sum += num;
      result += prefixCounts.getOrDefault(sum - k, 0);
      prefixCounts.merge(sum, 1, Integer::sum);
    }
    return result;
  }
}
