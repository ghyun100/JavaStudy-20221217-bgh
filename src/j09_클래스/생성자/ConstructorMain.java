package j09_클래스.생성자;

public class ConstructorMain {

	public static void main(String[] args) {
		ConstructorEx constructorEx1 = new ConstructorEx();
		ConstructorEx constructorEx2 = new ConstructorEx("최연호");
		ConstructorEx constructorEx3 = new ConstructorEx(624);
		ConstructorEx constructorEx4 = new ConstructorEx("최연호", 624);
		
		
	
		System.out.println(constructorEx2.name);
	}

}
