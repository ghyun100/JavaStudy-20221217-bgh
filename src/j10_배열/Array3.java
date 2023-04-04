package j10_배열;

import j09_클래스.접근지정자.student.Student;

public class Array3 {

	public static void main(String[] args) {
		/*
		 * 문제 :
		 * names 배열 5개
		 * stdentYears 배열 5개
		 * scores 배열 5개
		 * 
		 * 최연호 3 75.9
		 * 김민종 2 80.5
		 * 김소유 4 85.7
		 * 박상훈 4 88.3
		 * 백가현 4 78.5
		 * 
		 * 최연호 \t3 \t75.9점
		 * 김민종 \t2 \t80.5점
		 * 김소유 \t4 \t85.7점
		 * 박상훈 \t4 \t88.3점
		 * 백가현 \t4 \t78.5점
		 * 
		 */
		
		String[] names = {"최연호","김민종","김소유","박상훈","백가현"};
		int[] studentYear = {3,2,4,4,4};
		double[] scores = {75.9, 80.5, 85.7, 88.3, 78.5};

		for(int i = 0; i < 5 ;i++) {
			System.out.println(names[i] + "\t" + studentYear[i] + "\t" + scores[i] + "점");
		}
	
		
		
		//객체배열
		Student[] students = new Student[5];
		//ctrl + Sttudent[] 마우스클릭
		
		students[0] = new Student("홍길동", 3, 15, "부산", "010-3300-4698");
		for(int i = 0; i < 5; i++) {
			if(students[i] == null) {
				continue;
			}
			System.out.println("이름: " + students[i].getName());
		}
	}

}