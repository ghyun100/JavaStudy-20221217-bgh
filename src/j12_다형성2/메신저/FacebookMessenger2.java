package j12_다형성2.메신저;

public class FacebookMessenger2 implements Messenger2{

	@Override
	public void send() {
		System.out.println("페이스북 메세지를 보냅니다.");
	}

	@Override
	public void receive() {
		System.out.println("페이스북 메세지를 받습니다.");
	}
	
	
	public void call() {
		System.out.println("페이스북 메신저로 전화연결을 시도합니다.");
	}
	

}
