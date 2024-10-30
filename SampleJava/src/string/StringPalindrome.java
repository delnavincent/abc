package string;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String str=sc.next();
	StringBuffer s1=new StringBuffer(str);
	StringBuffer reverse = s1.reverse();
	String s=reverse.toString();
	if(s.equals(str)) {
		System.out.println("palindrome");
	}else {
		System.out.println("Not palindrome");
	}

	}
}
