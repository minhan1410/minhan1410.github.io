import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
	public static final Pattern StkRegex = Pattern.compile("^\\d{8,16}$");
	public static final Pattern MobileRegex = Pattern.compile("^\\d{10,11}$");

	private Validation() {
	}

	public static Boolean validateSTK(String STK) {
		Matcher matcher = StkRegex.matcher(STK);
		boolean flag = matcher.find();
		return flag;
	}

	public static Boolean validateMobile(String mobile) {
		Matcher matcher = MobileRegex.matcher(mobile);
		boolean flag = matcher.find();
		return flag;
	}
}
