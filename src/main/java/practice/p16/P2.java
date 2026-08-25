package practice.p16;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

// medium
// https://leetcode.com/problems/course-schedule/
public class P2 {
  public boolean canFinish(int numCourses, int[][] prerequisites) {
    List<List<Integer>> unlocks = new ArrayList<>();
    for (int i = 0; i < numCourses; i++) {
      unlocks.add(new ArrayList<>());
    }
    int[] blockedBy = new int[numCourses];
    for (int[] pair : prerequisites) {
      unlocks.get(pair[1]).add(pair[0]);
      blockedBy[pair[0]]++;
    }

    Deque<Integer> ready = new ArrayDeque<>();
    for (int course = 0; course < numCourses; course++) {
      if (blockedBy[course] == 0) {
        ready.add(course);
      }
    }

    int taken = 0;
    while (!ready.isEmpty()) {
      int course = ready.remove();
      taken++;
      for (int next : unlocks.get(course)) {
        if (--blockedBy[next] == 0) {
          ready.add(next);
        }
      }
    }
    return taken == numCourses;
  }
}
