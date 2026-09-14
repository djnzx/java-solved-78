package practice.p13;

// base
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class P1 {
  public char nextGreatestLetter(char[] letters, char target) {
    int low = 0;
    int high = letters.length;
    while (low < high) {
      int mid = (low + high) >>> 1;
      if (letters[mid] <= target) {
        low = mid + 1;
      } else {
        high = mid;
      }
    }
    return letters[low % letters.length];
  }
}
