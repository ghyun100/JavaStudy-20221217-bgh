package j05_입력;

import java.util.Scanner;

public class input2 {

	public static void main(String[] args) {
		/*
		 * 문제 
		 * Scanner
		 * 입력 
		 * 이름 : 최연호  next()        변수명 : name
		 * 생일 : 624     nextInt()              birth
		 * 주소 : 부산 진구 가야동 nextLine()    address
		 * 연락처 : 010-3300-4698  next()        phone'
		 * 
		 * 출력
		 * 사용자의 이름은 최연호이고 생일은 624입니다.
		 * 주소는 부산 진구 가야동에 거주중입니다.
		 * 연락처는 010-3300-4698 입니다.
		 * 
		 */
		
		
		
		Scanner scanner = new Scanner(System.in);

		
		System.out.print("이름 : ");
		String name = scanner.next();
		
		
		System.out.print("생일 : ");
		int birth = scanner.nextInt();
		
//		앞에 띄어쓰기와 enter를 대신먹을 친구가 필요 => next(),nextInt()가 앞에 있어서 버퍼가 걸림
		
		scanner.nextLine();
//		scanner.nextLine() : 넥스트 라인 전에는 엔터를 먹을 수 있는 넥스트 라인을 적어줘야 함
		
		
		System.out.print("주소: ");
		String address = scanner.nextLine();
		
		System.out.print("연락처 : ");
		String phone = scanner.next();
		
		
		System.out.println("사용자의 이름은 " + name + "이고 생일은 " + birth + "입니다.");
		System.out.println("주소는 " + address + "입니다.");
		System.out.println("연락처는 " + phone + "입니다.");	
		
		
	}

}
