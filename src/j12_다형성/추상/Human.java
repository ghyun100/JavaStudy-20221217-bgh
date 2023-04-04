package j12_다형성.추상;

public class Human extends Animal {
	
	@Override
	public void move() {
	}
	//(위) move 메소드는 무조건 구현 되어져야 한다.
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}

}
