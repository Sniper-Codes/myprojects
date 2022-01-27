package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A3 {
public static void main(String[] args) {
	Pattern p = Pattern.compile("a?"); 
	// meaning of 
	Matcher m = p.matcher("aaabbbssaaabdddgaafssaa");
	while(m.find()) {
		System.out.println(m.start()+"......"+m.group());
	}
}
}
//* -->It gives us zeroth index occurrence and single occurrences of particular character in a given string.
//How did you perform form validation?
//Ans is I did form validation using regular expressions