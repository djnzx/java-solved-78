package practice.p07;

import java.util.HashSet;
import java.util.Set;

// base
// https://leetcode.com/problems/happy-number/
public class P1 {
  public boolean isHappy(int n) {
    Set<Integer> seen = new HashSet<>();
    while (n != 1 && seen.add(n)) {
      n = squareSum(n);
    }
    return n == 1;
  }

  private int squareSum(int n) {
    int sum = 0;
    while (n > 0) {
      int digit = n % 10;
      sum += digit * digit;
      n /= 10;
    }
    return sum;
  }
}
