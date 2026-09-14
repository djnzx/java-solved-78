package practice.p06;

// base
// https://leetcode.com/problems/find-the-difference/
public class P1 {
  public char findTheDifference(String s, String t) {
    char result = 0;
    for (int i = 0; i < s.length(); i++) {
      result ^= s.charAt(i);
    }
    for (int i = 0; i < t.length(); i++) {
      result ^= t.charAt(i);
    }
    return result;
  }
}
