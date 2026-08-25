package practice.p14;

import java.util.ArrayDeque;
import java.util.Deque;

// medium
// https://leetcode.com/problems/daily-temperatures/
public class P2 {
  public int[] dailyTemperatures(int[] temperatures) {
    int[] result = new int[temperatures.length];
    Deque<Integer> pending = new ArrayDeque<>();

    for (int day = 0; day < temperatures.length; day++) {
      while (!pending.isEmpty() && temperatures[pending.peek()] < temperatures[day]) {
        int earlier = pending.pop();
        result[earlier] = day - earlier;
      }
      pending.push(day);
    }
    return result;
  }
}
