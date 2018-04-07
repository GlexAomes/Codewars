public class Groups {
  public static boolean groupCheck(String s){
		String result = s;
		for (int i = 0; i < s.length(); i++){
			result = result.replace("{}", "");
			result = result.replace("[]", "");
			result = result.replace("()", "");
		if (result.isEmpty()) return true;
		}
		return false;
	  }
}