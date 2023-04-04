package j19_익명클래스;

public class Main {

	public static void main(String[] args) {
		//추상클래스는 생성을 못함
//		AbstractTest abstractTest = new AbstractTest();
		
		AbstractTest abstractTestImpl = new AbstractTestImpl();
		abstractTestImpl.showData("JSON");
		abstractTestImpl.add(10, 20);
		
		AbstractTest abstractTest2 = new AbstractTest() {

			@Override
			public void showData(String data) {
				System.out.println("여기에서만 사용가능한 data");
			}

			@Override
			public void add(int num1, int num2) {
				System.out.println("더할 때 딱 한번만 사용함");
			}
			
		};
		abstractTest2.add(3, 4);
		
		
	}

}
