package j11_상속;

public class AnimalMain {

	public static void main(String[] args) {
		Human human = new Human();
		//부모생성자 먼저 호출하고 자기호출
		Tiger tiger = new Tiger();
		
		human.move();
		tiger.move();
		
		human.readBooks();
		
		
		
	}

}