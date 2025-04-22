package Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidation {
	public static void main(String[] args) {
		String regex="[789]\\d{9}";
		//String regex="^[789]\\d{9}";

		String text="7538203920,8912345678";
		
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(text);
		
		while(matcher.find()) {
			System.out.println(matcher.group()+"  "+matcher.start());
			
		}
		/*if(matcher.find()) {
			System.out.println(matcher.group()+"  "+matcher.start());
			
		}else {
			System.out.println("match not found");
		}*/
		
	}

}
