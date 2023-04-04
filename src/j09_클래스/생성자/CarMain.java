package j09_클래스.생성자;

public class CarMain {

	public static void main(String[] args) {
		//	밖에서 따로따로 불러오지 말고 생성자를 통해서 값을 주입하는 것 만들기
		
		Car car1 = new Car("현대자동차", "소나타", "화이트");
		car1.showCarInfo();
		
		Car car2 = new Car("기아", "아반떼", "블랙");
		car2.showCarInfo();
		
		
		
		
		

	}

}
