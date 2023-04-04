package j15_스태틱.싱글톤;

/*
 * 싱글톤(singleton)
 * 유일한 객체를 만들어서 공유하는 생성패턴
 * 1. 생성자는 접근지정자가 private이다.
 * 2. 자기 자신의 유일한 객체를 담을 수 있는 instance 라는 변수명을
 * 	  가진 스태틱 변수가 필요하다.
 * 3. instance 변수를 리턴(공유)해줄 getInstance 스태틱 메소드가 필요하다.
 * 
 */
public class KIA {
	
//	private KIA() {
//		
//	}

	//getInstance() - 할당된 하나의 메모리를 계속 씀(객체를 새로 안만듬)
	
	private static KIA instance;
	
	private Car[] carArray;
	private int autoCode;
	
	private KIA() {
		carArray = new Car[10];
		autoCode = 20230000;
	}
	
	//객체가 있는지 없는지
	public static KIA getInstance() {
		if(instance == null) {
			instance = new KIA();
		}
		return instance;
	}
	
	public Car produceCar(String model) {
		int carNumber = ++autoCode;
		String company = getClass().getSimpleName();
		
//		Car car = new Car(carNumber, company, model);
		Car car = Car.builder()
				.model(model)
				.company(company)
				.carNumber(carNumber)
				.build();
		
		if(addCar(car)) {
			return car;
		}
		
		return null;
	}
	
	private boolean addCar(Car car) {
		for(int i = 0; i < carArray.length; i++) {
			if(carArray[i] == null) {
				carArray[i] = car;
				System.out.println("배열에 차량 추가 완료");
				return true;
			}
		}
		System.out.println("배열에 공간이 없습니다.");
		return false;
	}
}
