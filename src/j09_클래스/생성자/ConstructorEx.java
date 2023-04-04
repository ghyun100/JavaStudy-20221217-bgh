package j09_클래스.생성자;

public class ConstructorEx {
	
	String name;
	int birth;
	
	//NoArgsConstructor(= 기본생성자)
	public ConstructorEx() {
		System.out.println("기본 생성자");
		System.out.println();
		
	}
	
	//RequiredArgsConstructor
	public ConstructorEx(String name) {
		System.out.println("매개변수: " + name);
		System.out.println("name을 매개변수로 받는 생성자");
		System.out.println();
		this.name = name;
		
	}
	
	//RequiredArgsConstructor
	public ConstructorEx(int birth) {
		System.out.println("매개변수: " + birth);
		System.out.println("birth를 매개변수로 받는 생성자");
		System.out.println();
	}
	
	//AllArgsConstructor(= 전체생성자)
	public ConstructorEx(String name, int birth) {
		System.out.println("매개변수: " + name);
		System.out.println("매개변수: " + birth);
		System.out.println("전체생성자");
		System.out.println();
		
		//Args -> Arguments(인수,매개변수)
	}
	
}
