package j13_최상위클래스;

public class HashCodeMain {

	public static void main(String[] args) {
		Student student = new Student(20230001, "최연호");
		Student student2 = new Student(20230001, "최연호");
		Student student3 = new Student(202230002, "최연호");
		
		//생성->주소할당
		
		
		System.out.println(student.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(student3.hashCode());
	}

}
