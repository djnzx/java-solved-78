package practice.p07;

// medium
// https://leetcode.com/problems/multiply-strings/
public class P2 {
  public String multiply(String num1, String num2) {
    if (num1.equals("0") || num2.equals("0")) {
      return "0";
    }
    int[] digits = new int[num1.length() + num2.length()];
    for (int i = num1.length() - 1; i >= 0; i--) {
      for (int j = num2.length() - 1; j >= 0; j--) {
        int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0') + digits[i + j + 1];
        digits[i + j + 1] = product % 10;
        digits[i + j] += product / 10;
      }
    }
    StringBuilder result = new StringBuilder();
    for (int digit : digits) {
      if (!result.isEmpty() || digit != 0) {
        result.append(digit);
      }
    }
    return result.toString();
  }
}
