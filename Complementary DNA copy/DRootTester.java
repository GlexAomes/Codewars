public class DRootTester{
    public static void main(String[] args){
        System.out.println("[Test1] Number: 16\nOutput: " + DRoot.digital_root(16) + "\nExpected: 7\n");
        System.out.println("[Test2] Number: 942\nOutput: " + DRoot.digital_root(942) + "\nExpected: 6\n");
        System.out.println("[Test3] Number: 132189\nOutput: " + DRoot.digital_root(132189) + "\nExpected: 6\n");
        System.out.println("[Test4] Number: 493193\nOutput: " + DRoot.digital_root(493193) + "\nExpected: 2\n");
        System.out.println("[Test5] Number: 11111\nOutput: " + DRoot.digital_root(11111) + "\nExpected: 5\n");
        System.out.println("[Test6] Number: 314159265\nOutput: " + DRoot.digital_root(314159265) + "\nExpected: 9\n");
    }
}