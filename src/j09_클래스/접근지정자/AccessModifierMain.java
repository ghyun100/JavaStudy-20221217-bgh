package j09_클래스.접근지정자;

import j09_클래스.접근지정자.a.TestA_2;
import j09_클래스.접근지정자.b.TestB;

public class AccessModifierMain {
	public static void main(String[] args) {
		TestA_2 testA_2 = new TestA_2();
		
		// 접근 지정자 아무것도 적지 않으면 default로 설정이 된다.
		//생성자는 기본적으로 public이라서 호출 가능.
		
		testA_2.testA2();
		
		TestB testB = new TestB();
		
		System.out.println(testB.getTb());
		
	}

}