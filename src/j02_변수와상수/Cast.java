package j02_변수와상수;

public class Cast {

	public static void main(String[] args) {
		char a = 'A';
		int b = a;
		
		double c = b;
		
		System.out.println(b);
		
		System.out.println(c); 
//		업캐스팅 : 명시안해줘도 됨
//		int d = c;
//		->안됨
	
		
		int d = (int) c;
		char e = (char) d;
		System.out.println(d);
		System.out.println(e);
//		다운캐스팅
	}

}
