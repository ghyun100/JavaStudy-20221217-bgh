package j05_입력;

import java.util.Scanner;

public class input1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		
//		scanner.next();
		String str = scanner.next();
		System.out.println("출력 :"+ str);
		
		System.out.print("내용을 입력하세요: ");
		String str2 = scanner.next();

		//		그냥next는 띄어쓰기가 안됨  , nextLine은 띄어쓰기가능
		System.out.println("출력 :"+ str2);
		
		scanner.nextLine();
    	String str3 = scanner.nextLine();
		String str4 = scanner.next();
		int num1 = scanner.nextInt();
		
		System.out.println("출력3 :" + str3);
		System.out.println("출력4 :" + str4);
		System.out.println(num1);
		
		
		
		
	
		
		
		
		
		
		
		
	}

}
