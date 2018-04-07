import java.util.Scanner;

public class ReverseStringTester{
    public static void main(String[] args){
        System.out.println("[Test1] Input: world\nOutput: " + ReverseString.reverse("world") + "\nExpected: dlrow\n");
        System.out.println("[Test2] Input: string\nOutput: " + ReverseString.reverse("string") + "\nExpected: gnirts\n");
        System.out.println("[Test3] Input: rotator\nOutput: " + ReverseString.reverse("rotator") + "\nExpected: rotator\n");
        System.out.println("[Test4] Input: eardrummers\nOutput: " + ReverseString.reverse("eardrummers") + "\nExpected: sremmurdrae\n");
    }
}