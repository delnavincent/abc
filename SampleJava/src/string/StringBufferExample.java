package string;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("welcome");
		s.append("home");
		System.out.println(s);
		s.insert(0,"Hi");
		System.out.println(s);
		s.replace(1, 4,"yaa");
		System.out.println(s);
		s.delete(0, 5);
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		System.out.println(s.capacity());
	}

}
