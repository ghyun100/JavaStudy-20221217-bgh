package j09_클래스.생성자;

public class ConstructorMain2 {

	public static void main(String[] args) {
		
		
		ConstructorEx2 asdf = new ConstructorEx2();
		ConstructorEx2 asdf2 = new ConstructorEx2("백가현");
		ConstructorEx2 asdf3 = new ConstructorEx2(1111);
		ConstructorEx2 asdf4 = new ConstructorEx2("백가현",1111);

		
		System.out.println(asdf);
		System.out.println(asdf2.name);
		System.out.println(asdf3.birth);
		System.out.print(asdf4.name);
		System.out.println(asdf4.birth);
		
		
		
		/*
		 * 생성자는 기본생성자외 생성자를 오버로딩하면 기본생성자는
		 * 비활성화됨.
		 * 
		 * 기본생성자가 꼭 필요할 시 무조건 명시를 해줘야함.
		 * 
		 */
		
		
		
		
		
		
	}

}
