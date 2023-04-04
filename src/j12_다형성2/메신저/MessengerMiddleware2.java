package j12_다형성2.메신저;

public class MessengerMiddleware2 {
	
	private Messenger2 messenger2;
	
	public MessengerMiddleware2 (Messenger2 messenger2) {
		
		this.messenger2 = messenger2;
	}
	

	public void sendMessege() {
		messenger2.send();
	}
	
	public void recieveMessege() {
		messenger2.receive();
	}
	
	
	
	
	public void AddOns() {
		
		System.out.println("추가 기능 실행");

		if(messenger2 instanceof KakaoTalk2) {
			((KakaoTalk2) messenger2).present();
		}else if(messenger2 instanceof FacebookMessenger2) {
			((FacebookMessenger2) messenger2).call();
		}else {
			System.out.println("형변환불가");
		}
		
		
	}
	

}









