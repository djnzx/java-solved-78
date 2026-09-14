package practice.p03;

// medium
// https://leetcode.com/problems/powx-n/
public class P2 {
  public double myPow(double x, int n) {
    long exponent = n;
    if (exponent < 0) {
      x = 1 / x;
      exponent = -exponent;
    }
    double result = 1;
    while (exponent > 0) {
      if ((exponent & 1) == 1) {
        result *= x;
      }
      x *= x;
      exponent >>= 1;
    }
    return result;
  }
}
