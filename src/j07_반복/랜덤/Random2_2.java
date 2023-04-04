package j07_반복.랜덤;

import java.util.Random;

public class Random2_2 {

	public static void main(String[] args) {
		//랜덤으로 10개의 값을 뽑고 가장 큰 값을 출력하는 방법
	
		Random random = new Random();
		
		
		int i = 0;
		int temp = 0;
		while(i < 10) {
			int rNum = random.nextInt(10);
			
			System.out.println("현재temp값: " + temp);
			System.out.println("새로 생성된값: " + rNum);
			System.out.println();
			
			
			if(i == 0) {
				temp = rNum;
				
			}else {
				if(temp < rNum) {
					temp = rNum;
				}
			}
			i++;
		}
		System.out.println("최댓값: " + temp);
	}

}
