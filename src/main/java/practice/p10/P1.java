package practice.p10;

// base
// https://leetcode.com/problems/min-cost-climbing-stairs/
public class P1 {
  public int minCostClimbingStairs(int[] cost) {
    int twoStepsBack = 0;
    int oneStepBack = 0;
    for (int i = 2; i <= cost.length; i++) {
      int current = Math.min(oneStepBack + cost[i - 1], twoStepsBack + cost[i - 2]);
      twoStepsBack = oneStepBack;
      oneStepBack = current;
    }
    return oneStepBack;
  }
}
