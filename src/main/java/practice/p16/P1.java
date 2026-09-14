package practice.p16;

// base
// https://leetcode.com/problems/find-champion-i/
public class P1 {
  public int findChampion(int[][] grid) {
    int champion = 0;
    for (int team = 1; team < grid.length; team++) {
      if (grid[team][champion] == 1) {
        champion = team;
      }
    }
    return champion;
  }
}
