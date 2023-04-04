package j09_클래스;

public class Car {
	
	
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
	 *
     *현대자동차
	 *아반떼
	 *그레이
	 */
	

	String company;
	String model;
	String color;
	
	public Car() {
		System.out.println("생성자 호출");
		//생성자는 무조건 주소값을 리턴한다.
		//생성자는 무조건 클래스와 이름이 동일하다.
	}
	
	
	void showCarInfo() {
		System.out.println("회사명: " + company);
		System.out.println("모델명: " + model);
		System.out.println("색상: " + color);
		System.out.println();
		
		
		
	}

}
