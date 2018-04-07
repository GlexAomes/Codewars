public class Line {
  public static String Tickets(int[] peopleInLine)
  {
    if (peopleInLine[0] != 25){
      return "NO";
    }
    int twentyFives = 0, fifties = 0;
    for (int i : peopleInLine){
      if (i == 25) twentyFives++;
        if (i == 50) {
          fifties++;
          twentyFives--;
        }
        if (i == 100) {
        twentyFives--;
        fifties--;
        }  
        if (twentyFives < 0 || fifties < 0) return "NO";
    }
    return "YES";
  }
}