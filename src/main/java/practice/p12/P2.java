package practice.p12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// medium
// https://leetcode.com/problems/merge-intervals/
public class P2 {
  public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, Comparator.comparingInt((int[] interval) -> interval[0]));

    List<int[]> merged = new ArrayList<>();
    for (int[] interval : intervals) {
      if (!merged.isEmpty() && interval[0] <= merged.getLast()[1]) {
        merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
      } else {
        merged.add(new int[] {interval[0], interval[1]});
      }
    }
    return merged.toArray(new int[0][]);
  }
}
