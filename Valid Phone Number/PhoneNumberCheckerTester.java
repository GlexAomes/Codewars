public class PhoneNumberCheckerTester{
    public static void main(String[] args){
        System.out.println("[Test1] Number: (123) 456-7890\nOutput: " + PhoneNumberChecker.isValid("(123) 456-7890") + "\nExpected: true\n");
        System.out.println("[Test2] Number: (123) 456 7890\nOutput: " + PhoneNumberChecker.isValid("(123) 456 7890") + "\nExpected: false\n");
        System.out.println("[Test3] Number: (abc) def-ghij\nOutput: " + PhoneNumberChecker.isValid("(abc) def-ghij") + "\nExpected: false\n");
        System.out.println("[Test4] Number: (!@#) $%^-&*()\nOutput: " + PhoneNumberChecker.isValid("(!@#) $%^-&*()") + "\nExpected: false\n");
        System.out.println("[Test5] Number: 444-4444\nOutput: " + PhoneNumberChecker.isValid("444-4444") + "\nExpected: false\n");
        System.out.println("[Test6] Number: (416) 392-2489\nOutput: " + PhoneNumberChecker.isValid("(416) 392-2489") + "\nExpected: true\n");
        System.out.println("[Test7] Number: (987) 654-3210123456789\nOutput: " + PhoneNumberChecker.isValid("(987) 654-3210123456789") + "\nExpected: false\n");
    }
}