
package j13_최상위클래스;

public class EqualsMain {

	public static void main(String[] args) {
		Student s1 = new Student(20220001, "최연호");
		Student s2 = new Student(20220001, "최연호");
		Student s3 = new Student(20220002, "홍길동");
		Student s4 = new Student(20220002, "최연호");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
