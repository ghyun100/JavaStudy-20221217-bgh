package j12_다형성.인터페이스2;

public class Moniter2 implements HDMI2{

	@Override
	public void connect() {
		System.out.println("HDMI를 통해 모니터를 연결합니다.");
	}

	@Override
	public void disconnect() {
		System.out.println("HDMI에 연결된 모니터 연결을 해제합니다.");
	}
	
	

}
