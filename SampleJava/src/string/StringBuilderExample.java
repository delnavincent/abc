package string;

public class StringBuilderExample {

	public static void main(String[] args) {
	
		StringBuilder s=new StringBuilder("wonderful");
		s.append("experience");
		System.out.println(s);
		s.insert(0,"what");
		System.out.println(s);
		s.replace(1, 4,"yes");
		System.out.println(s);
		s.delete(3, 5);
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		System.out.println(s.capacity());
		
	}

}
