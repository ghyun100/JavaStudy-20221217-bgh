package j09_클래스.접근지정자.student;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student();

		
		s1.setStudentYear(3);
		s1.setName("백가현");
		System.out.println();
		
		System.out.println(s1.getStudentYear());
		System.out.println(s1.getName());
		
		
		
		
		
		
		
	}

}
