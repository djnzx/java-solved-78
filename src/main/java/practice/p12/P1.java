package practice.p12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

// base
// https://leetcode.com/problems/sort-array-by-increasing-frequency/
public class P1 {
  public int[] frequencySort(int[] nums) {
    Map<Integer, Integer> counts = new HashMap<>();
    for (int num : nums) {
      counts.merge(num, 1, Integer::sum);
    }
    return Arrays.stream(nums)
        .boxed()
        .sorted(
            Comparator.comparingInt((Integer num) -> counts.get(num))
                .thenComparing(Comparator.reverseOrder()))
        .mapToInt(Integer::intValue)
        .toArray();
  }
}
