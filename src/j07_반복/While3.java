package j07_반복;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		/*
		 * 문제 : 
		 * 반복횟수 입력: 10
		 * 
		 * n 변수에 저장
		 * 
		 * i = 1
		 * i = 2
		 * i = 3
		 * i = 4
		 * i = 5
		 * i = 6
		 * i = 7
		 * i = 8
		 * i = 9
		 * i = 10
		 * 
		 * 
		 * ------------------------------
		 * 
		 * i = 10
		 * i = 9
		 * i = 8
		 * i = 7
		 * i = 6
		 * i = 5
		 * i = 4
		 * i = 3
		 * i = 2
		 * i = 1
		 */
		
		Scanner scanner = new Scanner(System.in);
		
	   
		int i = 0;

		int num1 = 0;

		num1 = scanner.nextInt();

		while(i < num1) {

			System.out.println("i = " + (i + 1));
			i++;
		}
		System.out.println("-----------------------------");
		
		i = 0; // *다시대입
		while(i < num1) {
			System.out.println("i = " + (num1 - i));
			i++;
		}
	}

}
