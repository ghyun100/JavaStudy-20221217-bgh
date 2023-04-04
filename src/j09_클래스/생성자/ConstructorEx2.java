package j09_클래스.생성자;

public class ConstructorEx2 {

	String name;
	int birth;
	
	public ConstructorEx2() {
		System.out.println("기본생성자");
		
	}
	//Alt + Shift + s 누르고 Generate Consturctor UsingFields 클릭
	

	public ConstructorEx2(String name) {
		this.name = name;
		System.out.println(name);
	}


	public ConstructorEx2(int birth) {
		this.birth = birth;
		System.out.println(birth);
	}


	public ConstructorEx2(String name, int birth) {
		this.name = name;
		this.birth = birth;
		System.out.println(name + birth);
	}
	
	
}
