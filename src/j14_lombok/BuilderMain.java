package j14_lombok;

public class BuilderMain {

	public static void main(String[] args) {
		Builder builder = new Builder();
		Car car = builder.builder()
				.company("기아")
				.model("k5")
				.color("화이트")
				.build();
		System.out.println(car);
		
		Car car2 = builder.builder()
				.company("현대")
				.build();
				
		System.out.println(car2);
		
	}

}

