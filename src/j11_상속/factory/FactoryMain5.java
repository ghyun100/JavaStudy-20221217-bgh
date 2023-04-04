package j11_상속.factory;

public class FactoryMain5 {

	public static void main(String[] args) {
		/*
		 * 
		 * 문제 :
		 * 
		 * Factory Array 만들기(크기 20)
		 * 
		 * 배열의 인덱스가 
		 * 짝수이면 SamsungFactory 생성해서 대입
		 * 홀수이면 LGFactory 생성해서 대입
		 * 
		 * 삼성공장 1~10
		 * LG공장 1~10
		 * 
		 * 공장가동
		 * 
		 *~가동합니다.
		 *~생산합니다.
		 * ~멈춥니다.
		 * 
		 */
	
		
		
		
		 Factory[] factories = new Factory[20];
		 
		 for(int i = 0; i < 20; i++) {
			if(i % 2 == 0) {
				factories[i] = new SamsungFactory(i / 2 + 1); 
				}else {
					factories[i] = new LGFactory(i / 2 + 1);
				}
		 }
		
		 for(int i = 0; i < factories.length; i++) {
				factories[i].start();                                               
				if(factories[i] instanceof SamsungFactory) {
					((SamsungFactory) factories[i]).produceSmartPhone();
				}else {
					((LGFactory) factories[i]).produceSmartTv();
				}
				factories[i].stop();
				System.out.println();
			}
		 
		 
		 
	}

}
