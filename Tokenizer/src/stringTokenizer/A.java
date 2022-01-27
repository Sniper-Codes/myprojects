package stringTokenizer;

import java.util.StringTokenizer;
//Split the string using tokenizer in java

public class A {
	public static void main(String[] args) {
		int count =0;
		//StringTokenizer str= new StringTokenizer ("Adarsh Kulkarni Hubli");
	StringTokenizer str= new StringTokenizer ("16-01-2022", "--");
		while (str.hasMoreElements()) {
			System.out.println(str.nextToken());
			count++;
			
		}
		System.out.println(count++);
	}

}
