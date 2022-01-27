package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A2 {
public static void main(String[] args) {
	Pattern p = Pattern.compile("a+"); 
	//+ is wild cards
	Matcher m = p.matcher("aaabbbssaaabdddgaafssaa");
	while(m.find()) {
		System.out.println(m.start()+"......"+m.group());
	}
}
}
//+ -->It gives us atleast one occurences or group of occuerences of particular character