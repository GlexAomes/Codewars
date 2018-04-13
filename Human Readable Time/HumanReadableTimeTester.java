public class HumanReadableTimeTester{
    public static void main(String[] args){
        System.out.println("[Test1] Seconds: 300\nOutput: " + HumanReadableTime.makeReadable(300) + "\nExpected: 00:05:00\n");
        System.out.println("[Test2] Seconds: 0\nOutput: " + HumanReadableTime.makeReadable(0) + "\nExpected: 00:00:00\n");
        System.out.println("[Test3] Seconds: 12345\nOutput: " + HumanReadableTime.makeReadable(12345) + "\nExpected: 03:25:45\n");
        System.out.println("[Test4] Seconds: 40271\nOutput: " + HumanReadableTime.makeReadable(40271) + "\nExpected: 11:11:11\n");
        System.out.println("[Test5] Seconds: 45296\nOutput: " + HumanReadableTime.makeReadable(45296) + "\nExpected: 12:34:56\n");
        System.out.println("[Test6] Seconds: 359999\nOutput: " + HumanReadableTime.makeReadable(359999) + "\nExpected: 99:59:59\n");
    }
}