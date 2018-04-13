public class Dashatizer {
	public static String dashatize(int num) {
		String result = "";
		for (char c : String.valueOf(num).toCharArray()){
		  String digit = ""+c;
		  if (digit.matches("[13579]")) {
			result += "-" + digit + "-";
			continue;
		  }
		  result += ""+c;
		}
		result = result.replace("--", "-");
		if (result.charAt(0) == '-') result = result.substring(1);
		if (result.charAt(result.length()-1) == '-') result = result.substring(0, result.length()-1);
		return result;
	}
}