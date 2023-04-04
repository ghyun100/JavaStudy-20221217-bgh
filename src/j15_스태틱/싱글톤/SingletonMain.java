package j15_스태틱.싱글톤;

public class SingletonMain {

	public static void main(String[] args) {
//		KIA kia = new KIA();
	
		KIA kia = KIA.getInstance();
//		kia.produceCar("k3");
		
		System.out.println(kia.produceCar("k3"));
	
		
		KIA kia2 = KIA.getInstance();
		System.out.println(kia.produceCar("k5"));
		
		KIA kia3 = KIA.getInstance();
		System.out.println(kia.produceCar("k7"));
		
		KIA kia4 = KIA.getInstance();
		System.out.println(kia.produceCar("k8"));
		
		KIA kia5 = KIA.getInstance();
		System.out.println(kia.produceCar("k9"));
		
	
		
	
		Test1 test1 = new Test1();
		Test2 test2 = new Test2();
		
	
		

		
		
		
	
	}

}
