package j10_배열;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		//정수 배열
		int[] numbers = new int[5];
		
		//문자열 배열
		String[] strArary = new String[5];
		
		//객체 배열
		Scanner[] scanArray = new Scanner[5];
		
		//*전부 주소를 담고 있음
		
		//배열에 값 추가
		numbers[0] = 10;
		numbers[1] = 20;
		
		strArary[4] = "문자열";
		
		scanArray[0] = new Scanner(System.in);
		
	}

}
