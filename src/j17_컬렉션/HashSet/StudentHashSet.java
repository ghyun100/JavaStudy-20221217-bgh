package j17_컬렉션.HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

import j15_스태틱.Student;

public class StudentHashSet {

	public static void main(String[] args) {
		/*
		 * 실습
		 * 
		 * 
		 */
		
		

		Student student1 = new Student("최연호");
		Student student2 = new Student("정예빈");
		Student student3= new Student("박상훈");
		Student student4 = new Student("백가현");
		Student student5 = new Student("서정근");
		
		HashSet<Student> studentSet = new HashSet<Student>();
		
		Student[] students = {student1, student2, student3, student4, student5};
		
		studentSet.addAll(Arrays.asList(students));
		System.out.println(studentSet);
		
		//foreach로 삭제
		
//		for(Student student : studentSet ) {
//			if(student.getName().equals("서정근")) {
//				studentSet.remove(student);
//				break;
//			}
//			
//		}
//		
//		System.out.println(studentSet);
		
		
		
		Iterator<Student> ir = studentSet.iterator();
		while(ir.hasNext()) {
			Student student = ir.next();
			if(student.getName().equals("최연호")) {
				//조건 순간에 객체를 찾아서 지우는 방법
//				studentSet.remove(student);
//				break;
				
				//조건 순간에 그 순간의 범위를 지우는 방법
				ir.remove();
			}
		}
		
		System.out.println(studentSet);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
