public class DashatizerTester{
    public static void main(String[] args){
        System.out.println("[Test1] Number: 123456789\nOutput: " + Dashatizer.dashatize(123456789) + "\nExpected: 1-2-3-4-5-6-7-8-9\n");
        System.out.println("[Test2] Number: 13579\nOutput: " + Dashatizer.dashatize(13579) + "\nExpected: 1-3-5-7-9\n");
        System.out.println("[Test3] Number: 2468\nOutput: " + Dashatizer.dashatize(2468) + "\nExpected: 2468\n");
        System.out.println("[Test4] Number: 244414442\nOutput: " + Dashatizer.dashatize(244414442) + "\nExpected: 2444-1-4442\n");
        System.out.println("[Test5] Number: 9722279\nOutput: " + Dashatizer.dashatize(9722279) + "\nExpected: 9-7-222-7-9\n");
    }
}