public class ReversedWords{
	public static String reverseWords(String str){
		 String[] words = str.split(" ");
		 java.util.Collections.reverse(java.util.Arrays.asList(words));
		 return String.join(" ", words);
	}
 }