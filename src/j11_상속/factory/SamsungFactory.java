package j11_상속.factory;

public class SamsungFactory extends Factory{

	public SamsungFactory(int factoryNumber) {
		super(factoryNumber);
	}
	
	@Override
	public void start() {
		System.out.print("삼성");
		super.start();
		//super.start -> 부모에 있는  start실행
	}
	
	
	
	@Override
	public void stop() {
		System.out.print("삼성");
		super.stop();
	}
	
	public void produceSmartPhone() {
		System.out.println("삼성 스마트폰을 만듭니다.");
	}

}
