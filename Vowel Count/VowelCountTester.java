public class VowelCountTester{
    public static void main(String[] args){
        System.out.println("[Test1] Input: queueing\nOutput: " + VowelCount.getCount("queueing") + "\nExpected: 5\n");
        System.out.println("[Test2] Input: zoo\nOutput: " + VowelCount.getCount("zoo") + "\nExpected: 2\n");
        System.out.println("[Test3] Input: rhythms\nOutput: " + VowelCount.getCount("rhythms") + "\nExpected: 0\n");
        System.out.println("[Test4] Input: \nOutput: " + VowelCount.getCount("") + "\nExpected: 0\n");
        System.out.println("[Test5] Input: VOWEL\nOutput: " + VowelCount.getCount("VOWEL") + "\nExpected: 2\n");
    }
}