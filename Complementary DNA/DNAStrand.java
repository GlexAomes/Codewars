public class DNAStrand {
  public static String makeComplement(String dna) {
    String result = "";
    for(Character c : dna.toCharArray()){
        if (c.equals('C')) result += "G";
        else if (c.equals('G')) result += "C";
        else if (c.equals('A')) result += "T";
        else if (c.equals('T')) result += "A";
        else result += c;
    }
    return result;
  }
}