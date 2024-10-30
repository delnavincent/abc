package string;

public class StringExample {

	public static void main(String[] args) {
	String s="Sachin";
	String s1="Tendulkar";
	String s2="SACHIN";
	String s3="Hello World";
	String s4="java is simple";
	System.out.println(s.concat("Tendulkar"));
	System.out.println(s.length());
	System.out.println(s.equals(s1));
	System.out.println(s.compareTo(s1));
	System.out.println(s.equalsIgnoreCase(s2));
	System.out.println(s.charAt(1));
	System.out.println(s.toUpperCase());
	System.out.println(s2.toLowerCase());
	System.out.println(s3.trim());
	s4.replace("java","c++");
	System.out.println(s4);
	System.out.println(s3.startsWith("H"));
	System.out.println(s3.endsWith("d"));
	System.out.println(s3.contains("Hello"));
	int a = 10;
	System.out.println(String.valueOf(a));
	System.out.println(a+s3);
	
	
	

	}

}
