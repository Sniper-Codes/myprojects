package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
public static void main(String[] args) {
	Pattern p = Pattern.compile("a*"); 
	// meaning of (star)* it gives us zero or group of occurrences of a specific character
	Matcher m = p.matcher("aaabbbssaaabdddgaafssaa");
	while(m.find()) {
		System.out.println(m.start()+"......"+m.group());
	}
}
}
//* -->It gives us zero occurences or group of occuerences of particular character