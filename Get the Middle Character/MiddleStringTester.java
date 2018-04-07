public class MiddleStringTester{
    public static void main(String[] args){
        System.out.println("[Test1] Word: test\nOutput: " + MiddleString.getMiddle("test") + "\nExpected: es\n");
        System.out.println("[Test2] Word: testing\nOutput: " + MiddleString.getMiddle("testing") + "\nExpected: t\n");
        System.out.println("[Test3] Word: middle\nOutput: " + MiddleString.getMiddle("middle") + "\nExpected: dd\n");
        System.out.println("[Test4] Word: A\nOutput: " + MiddleString.getMiddle("A") + "\nExpected: A\n");
        System.out.println("[Test5] Word: \nOutput: " + MiddleString.getMiddle("") + "\nExpected: \n");
        System.out.println("[Test6] Word: bruxism\nOutput: " + MiddleString.getMiddle("bruxism") + "\nExpected: x\n");
        System.out.println("[Test7] Word: dabble\nOutput: " + MiddleString.getMiddle("dabble") + "\nExpected: bb\n");
        System.out.println("[Test8] Word: good\nOutput: " + MiddleString.getMiddle("good") + "\nExpected: oo\n");
    }
}