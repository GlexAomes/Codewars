public class DescendingOrderTester{
    public static void main(String[] args){
        System.out.println("[Test1] Number: 21445\nOutput: " + DescendingOrder.sortDesc(21445) + "\nExpected: 54421\n");
        System.out.println("[Test2] Number: 145263\nOutput: " + DescendingOrder.sortDesc(145263) + "\nExpected: 654321\n");
        System.out.println("[Test3] Number: 123456789\nOutput: " + DescendingOrder.sortDesc(123456789) + "\nExpected: 987654321\n");
        System.out.println("[Test4] Number: 0\nOutput: " + DescendingOrder.sortDesc(0) + "\nExpected: 0\n");
        System.out.println("[Test5] Number: 90210\nOutput: " + DescendingOrder.sortDesc(90210) + "\nExpected: 92100\n");
    }
}