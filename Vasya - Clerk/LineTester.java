import java.util.Arrays;

public class LineTester{
    public static void main(String[] args){
        int[] test1 = { 25, 25, 50 };
        int[] test2 = { 25, 100 };
        int[] test3 = { 25, 25, 25, 25, 25, 25, 25, 25, 25, 25 };
        int[] test4 = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
        int[] test5 = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
        int[] test6 = { 25, 25, 25, 25, 50, 100, 50 };
        int[] test7 = { 50, 100, 100 };
        int[] test8 = { 25, 25, 100 };
        int[] test9 = { 25, 25, 25, 25, 25, 25, 25, 50, 50, 50, 100, 100, 100, 100 };
        int[] test10 = { 25, 25, 50, 50, 100 };

        System.out.println("[Test1] Line: " + Arrays.toString(test1) + "\nOutput: " + Line.Tickets(test1) + "\nExpected: YES\n");
        System.out.println("[Test2] Line: " + Arrays.toString(test2) + "\nOutput: " + Line.Tickets(test2) + "\nExpected: NO\n");
        System.out.println("[Test3] Line: " + Arrays.toString(test3) + "\nOutput: " + Line.Tickets(test3) + "\nExpected: YES\n");
        System.out.println("[Test4] Line: " + Arrays.toString(test4) + "\nOutput: " + Line.Tickets(test4) + "\nExpected: NO\n");
        System.out.println("[Test5] Line: " + Arrays.toString(test5) + "\nOutput: " + Line.Tickets(test5) + "\nExpected: NO\n");
        System.out.println("[Test6] Line: " + Arrays.toString(test6) + "\nOutput: " + Line.Tickets(test6) + "\nExpected: YES\n");
        System.out.println("[Test7] Line: " + Arrays.toString(test7) + "\nOutput: " + Line.Tickets(test7) + "\nExpected: NO\n");
        System.out.println("[Test8] Line: " + Arrays.toString(test8) + "\nOutput: " + Line.Tickets(test8) + "\nExpected: NO\n");
        System.out.println("[Test9] Line: " + Arrays.toString(test9) + "\nOutput: " + Line.Tickets(test9) + "\nExpected: NO\n");
        System.out.println("[Test10] Line: " + Arrays.toString(test10) + "\nOutput: " + Line.Tickets(test10) + "\nExpected: NO\n");
    }
}