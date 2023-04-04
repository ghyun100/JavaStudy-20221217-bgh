package j08_메소드;

public class Method4 {
	
	
	public static String add(int a) {
	
		System.out.println("한개의 수를 받았습니다.");
		return "한개 수의 덧셈은 안됩니다.";
		
	}
	
	public static int add(int a, int b) {
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println();
		return a + b;
	}
	
	public static int add(int a, int b, int c) {
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println();
		return a + b + c;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(add(1, 2, 3));
		System.out.println();
		System.out.println(add(5, 6));
		System.out.println();
		System.out.println(add(5));
		System.out.println();
		add(5);
	}

}
