public class ReversedWordsTester{
    public static void main(String[] args){
        System.out.println("[Test1] Input: this is backwards\nOutput: " + ReversedWords.reverseWords("this is backwards") + "\nExpected: backwards is this\n");
        System.out.println("[Test2] Input: forwards is this\nOutput: " + ReversedWords.reverseWords("forwards is this") + "\nExpected: this is forwards\n");
        System.out.println("[Test3] Input: Computer Science is interesting\nOutput: " + ReversedWords.reverseWords("Computer Science is interesting") + "\nExpected: interesting is Science Computer\n");
        System.out.println("[Test4] Input: left to right\nOutput: " + ReversedWords.reverseWords("left to right") + "\nExpected: right to left\n");
        System.out.println("[Test5] Input: f(x) = 2x^2 + 5 = g(x)\nOutput: " + ReversedWords.reverseWords("f(x) = 2x^2 + 5 = g(x)") + "\nExpected: g(x) = 5 + 2x^2 = f(x)\n");
        System.out.println("[Test6] Input: The greatest victory is that which requires no battle\nOutput: " + ReversedWords.reverseWords("The greatest victory is that which requires no battle") + "\nExpected: battle no requires which that is victory greatest The\n");
    }
}