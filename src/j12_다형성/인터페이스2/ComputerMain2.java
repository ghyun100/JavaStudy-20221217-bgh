package j12_다형성.인터페이스2;

public class ComputerMain2 {

	public static void main(String[] args) {
		Moniter2 moniter2 = new Moniter2();
		Computer2 computer2 = new Computer2(moniter2);
		
		computer2.powerOn();
		
		for(int i = 0; i < 3; i++) {
			computer2.powerOn();
			
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			computer2.powerOff();
		}
	}

}
