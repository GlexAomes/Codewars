public class DNAStrandTester{
    public static void main(String[] args){
        System.out.println("[Test1] DNA: ATTGC\nOutput: " + DNAStrand.makeComplement("ATTGC") + "\nExpected: TAACG\n");
        System.out.println("[Test2] DNA: GTAT\nOutput: " + DNAStrand.makeComplement("GTAT") + "\nExpected: CATA\n");
        System.out.println("[Test3] DNA: TATAAT\nOutput: " + DNAStrand.makeComplement("TATAAT") + "\nExpected: ATATTA\n");
        System.out.println("[Test4] DNA: CGGTGAATAGCCTAGATGGCATATAGCATGATCATATGA\nOutput: " + DNAStrand.makeComplement("CGGTGAATAGCCTAGATGGCATATAGCATGATCATATGA") + "\nExpected: GCCACTTATCGGATCTACCGTATATCGTACTAGTATACT\n");

        
    }
}