package j17_컬렉션.ArrayList;

import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import j15_스태틱.Student;

public class StudentArrayList {

	public static void main(String[] args) {
		
		Student student1 = new Student("최연호");
		Student student2 = new Student("정예빈");
		Student student3= new Student("박상훈");
		Student student4 = new Student("백가현");
		Student student5 = new Student("서정근");
		
		/*
		 * 문제
		 * studentList
		 * Student 배열을 생성하고 그 배열을 리스트로 변환후에 
		 * 새로운 ArrayList를 생성하여 추가
		 * 
		 */
		
		
		ArrayList<Student> studentList = new ArrayList<Student>();		
		
		Student[] students = {student1, student2, student3, student4, student5};
		
//		//<한개씩 집어넣기>
//		studentList.add(student1);
//		studentList.add(student2);
//		studentList.add(student3);
//		studentList.add(student4);
//		studentList.add(student5);
		
		
//		//<반복문 써서 넣기>
//		for(int i = 0; i < students.length; i++) {
//			studentList.add(students[i]);
//		}
		
		//<한번에 넣기>
		studentList.addAll(Arrays.asList(students));
		
		System.out.println(studentList);
		
		
		
		for(Student student : studentList) {
			System.out.println(student);
		}
		
		//삭제
		
	
		/*
		 * 문제2
		 * 학생 이름이 박상훈인 객체를 찾아서
		 * 출력하고 삭제하기
		 * 반복문이용
		 */
			
		
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getName().equals("박상훈")) {
				System.out.println(studentList.get(i));
				studentList.remove(i);
			}
		}
			System.out.println(studentList);

			
//		다음주에 할거임
//		//foreach로 '서정근' 삭제
//		
//		for(Student student : studentList) {
//			if(student.getName().equals("서정근")) {
//				System.out.println(student);
//				studentList.remove(student);
//			}
//		System.out.println(studentList);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
