package j11_상속.factory;

public class Factory {
	private int factoryNumber;
	
	public Factory(int factoryNumber) {
		this.factoryNumber = factoryNumber;
	}
	
	public void start() {
		System.out.println(factoryNumber + "가동합니다.");
	}
	
	
	
	public void stop() {
		System.out.println(factoryNumber + "멈춥니다.");
	}
	
}
