public class Arge {
  public static int nbYear(int p0, double percent, int aug, int p) {
      int x = p0, count = 0;
      while (x < p){
        x = (int)(x + (x * percent / 100) + aug);
        count++;
      }
      return count;
  }
}