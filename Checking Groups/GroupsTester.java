public class GroupsTester{
    public static void main(String[] args){
        System.out.println("[Test1] Input: ()\nOutput: " + Groups.groupCheck("()") + "\nExpected: true\n");
        System.out.println("[Test2] Input: ({\nOutput: " + Groups.groupCheck("({") + "\nExpected: false\n");
        System.out.println("[Test3] Input: {[]()}\nOutput: " + Groups.groupCheck("{[]()}") + "\nExpected: true\n");
        System.out.println("[Test4] Input: {[(])}\nOutput: " + Groups.groupCheck("{[(])}") + "\nExpected: false\n");
        System.out.println("[Test5] Input: ([{([([])()[]])}])\nOutput: " + Groups.groupCheck("([{([([])()[]])}])") + "\nExpected: true\n");
        System.out.println("[Test6] Input: ([{([()()])[[]])}])\nOutput: " + Groups.groupCheck("([{([()()])[[]])}])") + "\nExpected: false\n");
    }
}