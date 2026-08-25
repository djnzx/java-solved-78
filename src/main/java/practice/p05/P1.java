package practice.p05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// base
// https://leetcode.com/problems/find-the-difference-of-two-arrays/
public class P1 {
  public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    Set<Integer> first = toSet(nums1);
    Set<Integer> second = toSet(nums2);

    List<Integer> onlyInFirst = new ArrayList<>(first);
    onlyInFirst.removeAll(second);
    List<Integer> onlyInSecond = new ArrayList<>(second);
    onlyInSecond.removeAll(first);

    return List.of(onlyInFirst, onlyInSecond);
  }

  private Set<Integer> toSet(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
      set.add(num);
    }
    return set;
  }
}
