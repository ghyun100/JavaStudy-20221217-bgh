package j12_다형성2.메신저;

public class KakaoTalk2 implements Messenger2{

	@Override
	public void send() {
		System.out.println("카카오톡 메세지를 보냅니다.");
	}

	@Override
	public void receive() {
		System.out.println("카카오톡 메세지를 받습니다.");
	}
	
	public void present() {
		System.out.println("카카오톡 선물하기를 보냅니다.");
	}

}
