package j12_다형성2.메신저;

public class MessengerMain {

	public static void main(String[] args) {
		
		KakaoTalk2 kakaoTalk2 = new KakaoTalk2();
		FacebookMessenger2 facebookMessenger2 = new FacebookMessenger2();
		
		Messenger2 messenger2 = kakaoTalk2;
		
		MessengerMiddleware2 messengerMiddleware2 = new MessengerMiddleware2(messenger2);
			
			
		messengerMiddleware2.sendMessege();
		System.out.println("메세지 전송 완료");
		System.out.println();
		
		messengerMiddleware2.recieveMessege();
		System.out.println("새로운 메시지를 받음");
		System.out.println();
		
		messengerMiddleware2.AddOns();
		System.out.println("각각의 플랫폼만의 추가기능");
		
		
		
		
	}

}
