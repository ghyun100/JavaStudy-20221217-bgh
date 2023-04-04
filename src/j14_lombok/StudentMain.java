package j14_lombok;

public class StudentMain {

	public static void main(String[] args) {
//		Student student = new Student();
//		System.out.println(student);
		Student student2 = new Student(20230001, "홍길동" , 2, 21);
		
		System.out.println(student2.getName());
		
		System.out.println(student2.getStudentYear());
	}

} 
