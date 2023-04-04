package j03_연산자;

public class Operation2 {

	public static void main(String[] args) {
//		관계연산자
		System.out.println(10 > 5);
		
		boolean result = 10 > 5;
		System.out.println(result);
		
		boolean result2 = 10 == 5;
		System.out.println(result2);
		
		boolean result3 = 10 != 5;
		System.out.println(result3);
		
		boolean result4 = 10 < 5;
		System.out.println(result4);
		
//		boolean끼리는 산술연산 안됨
//		System.out.println(result + result2);
 
		System.out.println(""+ result + result2);
//		""글자를 더한 것 뿐 문자열처럼 더해짐
		
/*
 * 논리연산 : boolean 끼리 연산하는 것 
 * AND연산(&&) - 곱
 * true && true => true
 * true && false => false
 * false && false => false
 * 회원가입 할 때 사용, 아이디 영문 맞는지, 비밀번호 숫자영어 특수기호 조합이 
 * 다 맞는지 등등
 * 
 * 
 * OR연산(||) - 합
 * true || true => true
 * true || false => false
 * false || false =>false
 * 
 * 
 * NOT연산(!) - 부정
 * !true => false
 * !false => true
 * 
 * !(true && false) => true
 * 
 * 
 * 
 */
		System.out.println(!true);
		System.out.println(2000 % 4 == 0 && 2000 % 100 != 0);
		System.out.println(2000 % 4 == 0 && 2000 % 100 != 0 && 2000 % 5 == 0);
		
//		자바 연산자 우선순위 외우면 좋을 듯
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
