public class PhoneNumberChecker {
	public static boolean isValid(String phoneNumber) {
		return phoneNumber.matches("[(][0-9]{3}[)] [0-9]{3}[-][0-9]{4}");
	}
}