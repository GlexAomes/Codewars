public class DRoot {
  public static int digital_root(int n) {
    int sum = 0;
    String[] digits = String.valueOf(n).split("");
    if (digits.length == 1) return n;
    for (int i = 0; i < digits.length; i++) sum += Integer.valueOf(digits[i]);
    return digital_root(sum);
  }
}