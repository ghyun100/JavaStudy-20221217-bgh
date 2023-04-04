package j15_스태틱.싱글톤.같은거2;

import j15_스태틱.싱글톤.KIA;

public class SingletonMain {

	public static void main(String[] args) {
		KIA2 kia = KIA2.getInstance();
		System.out.println(kia.produceCar("바보당"));
		
		KIA kia2 = KIA.getInstance();
		System.out.println(kia.produceCar("k5"));
		
		KIA kia3 = KIA.getInstance();
		System.out.println(kia.produceCar("k7"));
		
		KIA kia4 = KIA.getInstance();
		System.out.println(kia.produceCar("k8"));
		
		KIA kia5 = KIA.getInstance();
		System.out.println(kia.produceCar("k9"));
		
		
	}

}
