package j07_반복;

public class While4 {

	public static void main(String[] args) {
		//구구단
		int dan = 2;
		int num = 0;
		
		//System.out.println(dan + " x " + num + " = " + (dan * num));
		
		/*
		 * 2 x 1 = 2
		 * 2 x 2 = 4
		 * 2 x 3 = 6
		 * ...
		 * 2 x 9 = 18
		 */
		
		int i = 0;
		int a = 2;
		while(i < 9) {
			int num2 = i + 1;
			System.out.println(a + " x " + num2 + " = " + (a * num2));
			i++;
		
		}
	}

}
