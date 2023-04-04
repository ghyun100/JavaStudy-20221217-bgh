package j04_문자열;

public class StringBuilder1 {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		
		
		stringBuilder.append("이름 : ");
		stringBuilder.append("백가현");
		
//		append = 추가
		
		stringBuilder.delete(1, 2);
		
//		index위치(1,2)를 삭제
//		(1,2) = 1부터 2전까지
		
		System.out.println(stringBuilder.toString());
//		stringBuilder에 문자열 추가 가능, 뒤에 .toString => StringBuilder에 있는걸 문자열로 출력
		
		
		
		
		
		
		
		
		
		
	}

}
