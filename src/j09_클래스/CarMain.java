package j09_클래스;

public class CarMain {

	public static void main(String[] args) {
		/*
		 * 문제 :
		 * 변수
		 *    company
		 *    model
		 *    color
		 *    
		 *    
		 *메소드 
		 *    showCarInfo()
		 *           회사명 : 000
		 *           모델명 : 000 
		 *           색상   : 000
		 *           
		 * 
		 *총 3대
		 *현대자동차
		 *쏘나타
		 *화이트
		 *
		 *               
		 *기아
		 *k5
		 *블랙               
		 *
		 *현대자동차
		 *아반떼
		 *그레이
		 *
		 */
		
//		System.out.println(new Car());
//		
//		System.out.println(new Car());
//		
//		System.out.println(new Car());
//		
//		System.out.println();
		
		Car car1 = new Car(); // ->셋 다 새로운 주소
		Car car2 = new Car();
		Car car3 = new Car();
		
		
		car1.company = "현대자동차";
		car2.company = "기아";
		car3.company = "현대자동차";
		
		car1.model = "쏘나타";
		car2.model = "k5";
		car3.model = "아반떼";
		
		car1.color = "화이트";
		car2.color = "블랙";
		car3.color = "그레이";
		
		car1.showCarInfo();
		car2.showCarInfo();
		car3.showCarInfo();
		
//		new Car();
//		System.out.println(new Car());
		
		
		
		
		
		
		
		
	}

}
