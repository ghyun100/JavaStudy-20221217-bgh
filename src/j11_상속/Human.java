package j11_상속;

public class Human extends Animal{


	public Human() {
		super();
		//super은 부모생성자를 호출
		System.out.println("Human 객체 생성"); 
		}
//extends가 상속
//	public void move() {
//		System.out.println("동물이 움직입니다.");
//	}
	
	
	//오버라이드 : 재정의
	//@ -> 어노테이션 이라 읽음.
	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	
	

	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}
