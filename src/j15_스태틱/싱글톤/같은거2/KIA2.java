package j15_스태틱.싱글톤.같은거2;

public class KIA2 {

	
	private static KIA2 instance;
	
		private Car2[] carArray;
		private int autocode;
	
		
	private KIA2() {
		carArray = new Car2[10];
		autocode = 20230000;
	}
	
	public static KIA2 getInstance() {
		if(instance == null) {
			instance = new KIA2();
		}
		return instance;
	}
		
		public Car2 produceCar(String model) {
			
			int carNumber = ++autocode;
			String company = getClass().getSimpleName();
			
			Car2 car2 = Car2.builder()
					.company(company)
					.model(model)
					.carNumber(carNumber)
					.build();
			
			if(addCar (car2)) {
				return car2;
			}
			return null;
		}
		
		
		private boolean addCar(Car2 car2) {
			for(int i = 0; i < carArray.length; i++) {
				if(carArray[i] == null) {
					carArray[i] = car2;
					System.out.println("배열에 차량추가 완료");
					return true;
				}
			}
				System.out.println("배열에 공간이 없습니다.");
				return false;
				
			
		
	}
	
	
}
