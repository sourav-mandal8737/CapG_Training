package Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPattern {
	public static void main(String[] args) {
	  //String str="Hello World \ntoday is 22";
		//String str="23This is a good day, be good CACEY 17";
	  
		//String str="adam plucked the apple and gave it to aaron";
		//String regex=".";
	  // String regex="[a-z\\d]";
		//String regex="[\\w\\s,]";
		
		String str="This is a good world";
		String regex="[a-f[m-t]]";

		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(str);
		
		//System.out.println(matcher.find());
		
		while(matcher.find()) {
			System.out.print(matcher.group());
		}
	}

}
