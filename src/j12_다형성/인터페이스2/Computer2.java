package j12_다형성.인터페이스2;

public class Computer2 {
	
	private HDMI2 hdmi2;
	
	public  Computer2(HDMI2 hdmi2) {
		this.hdmi2 = hdmi2;
	}
	
	public void powerOn() {
		System.out.println("컴퓨터의 전원을 켭니다.");
		connectedDisplay();
	}
	
	public void powerOff() {
		System.out.println("컴퓨터의 전원을 끕니다.");
		disconnectedDisplay();
	}
	
	private void connectedDisplay() {
		System.out.println("출력장치를 연결합니다.");
		hdmi2.connect();
	}
	
	private void disconnectedDisplay() {
		System.out.println("출력장치 연결을 해제합니다.");
		hdmi2.disconnect();
	}

}

