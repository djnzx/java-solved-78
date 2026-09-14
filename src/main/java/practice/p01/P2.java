package practice.p01;

// medium
// https://leetcode.com/problems/count-and-say/
public class P2 {
  public String countAndSay(int n) {
    String result = "1";
    for (int step = 1; step < n; step++) {
      StringBuilder next = new StringBuilder();
      int count = 1;
      for (int i = 1; i <= result.length(); i++) {
        if (i < result.length() && result.charAt(i) == result.charAt(i - 1)) {
          count++;
        } else {
          next.append(count).append(result.charAt(i - 1));
          count = 1;
        }
      }
      result = next.toString();
    }
    return result;
  }
}
