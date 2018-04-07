public class DescendingOrder {
  public static int sortDesc(final int num) {
    int[] counter = new int[10];
    String[] digits = String.valueOf(num).split("");
    for(String s : digits) counter[Integer.parseInt(s)]++;
    
    String buffer = "";
    for(int i = counter.length-1; i >= 0; i--) 
      for (int j = 0; j < counter[i]; j++) buffer += ""+i;
    
    return Integer.parseInt(buffer);
  }
}