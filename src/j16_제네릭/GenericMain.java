package j16_제네릭;

public class GenericMain {

	public static void main(String[] args) {
//		GenericTest genericTest = new GenericTest();
//		
//		genericTest.setNumber(100);
//		genericTest.setData("200");
//		System.out.println(genericTest.getNumber() + genericTest.getData());
		
		GenericTest<Integer, Integer> genericTest2 = new GenericTest<>();
		genericTest2.setNumber(100);
		genericTest2.setData(200);
		System.out.println(genericTest2.getNumber() + genericTest2.getData());
		
	
		GenericTest<Integer, String> genericTest3 = new GenericTest<>();
		genericTest3.setNumber(100);
		genericTest3.setData("200");
		System.out.println(genericTest3.getNumber() + genericTest3.getData());
		
		
	
	}

}
