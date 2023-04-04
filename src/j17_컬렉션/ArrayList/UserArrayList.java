package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.Getter;

@Getter
public class UserArrayList {

	private List<User> userList;
	private Scanner scanner;
	
	public UserArrayList() {
		userList = new ArrayList<User>();
		scanner = new Scanner(System.in);
	}
	
	public void addUser() {
		
		String username = null;
		String password = null;
		String name = null;
		String email = null;
		System.out.print("아이디 : ");
		username = scanner.nextLine();
		System.out.print("비밀번호 : ");
		password = scanner.nextLine();
		System.out.print("이름 : ");
		name = scanner.nextLine();
		System.out.print("이메일 : ");
		email = scanner.nextLine();
		
		User user = User.builder()
				.username(username)
				.password(password)
				.name(name)
				.email(email)
				.build();
		
		userList.add(user);
		
		// 위에 값들을 입력 받아서 User 객체로 만들기(Builder)
		// 리스트에 저장
	}
	
	public void printUserList() {
		/*
		 * 아이디	> yeonho
		 * 비밀번호 >1234
		 * 이름		>최연호
		 * 이메일	>yeonho@gmail.com
		 * 
		 * 아이디	> kang
		 * 비밀번호 >1111
		 * 이름		>강강강
		 * 이메일	>kang@gmail.com
		 * 
		 * 반복을 돌려서 모든 정보가 다 나와야함.
		 * (투스트링 쓰지말것)
		 */
		
		
	
		for(User user : userList) {
			System.out.println("아이디\t> " + user.getUsername());
			System.out.println("비밀번호\t> " + user.getPassword());
			System.out.println("이름\t>" + user.getName());
			System.out.println("이메일\t>"+ user.getEmail());
			
		}
		
	}
	
	public void removeUser() {
		/*
		 * 아이디 입력 받기
		 * 비밀번호 확인
		 * 비밀번호가 일치하면 삭제
		 *
		 */
	
		System.out.print("아이디 : ");
		String id = scanner.nextLine();
		
		for(User user : userList) {
			if(id.equals(user.getUsername())) {
				System.out.print("비밀번호 확인 : ");
				String ps = scanner.nextLine();
				if(ps.equals(user.getPassword())) {
					userList.remove(user);
					System.out.println("삭제완료");
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
					break;
				}
			}	
		System.out.println("해당 아이디는 존재하지 않습니다.");
		
		}
		
	}
	
	//방법2
//	System.out.print("아이디 : ");
//	String id = scanner.nextLine();
//	
//	for(User user : userList) {
//		if(user.getUsername().equals(id)) {
//			System.out.print("비밀번호 확인 : ");
//			String ps = scanner.nextLine();
//			if(user.getPassword().equals(ps)) {
//				userList.remove(user);
//				System.out.println("삭제완료");
//				return;
//			}else {
//				System.out.println("비밀번호가 일치하지 않습니다.");
//				return;
//			}
//		}	
//		
//	}System.out.println("해당 아이디는 존재하지 않습니다.");
//	 return은 메소드를 나옴(반복문 전체에서 나옴), void있어서 return 값 지정은
//	 불가능하지만 메소드를 빠져나오는 걸로 return;을 써줌
//}
//
	
	
	public static void main(String[] args) {
		/*
		 * 
		 * [사용자 관리 프로그램]
		 * 1. 사용자 추가
		 * 2. 사용자 리스트 출력
		 * 3. 사용자 삭제
		 * q. 프로그램 종료
		 * 
		 */
		
		UserArrayList userArrayList = new UserArrayList();
		
		while(true) {
			
			String select = null;
			
			System.out.println("[사용자 관리 프로그램]");
			System.out.println("1. 사용자 추가");
			System.out.println("2. 사용자 리스트 출력");
			System.out.println("3. 사용자 삭제");
			System.out.println("q. 프로그램 종료");
			
			select = userArrayList.getScanner().nextLine();
			
			if(select.equals("1")) {
				userArrayList.addUser();
			}else if(select.equals("2")) {
				userArrayList.printUserList();
			
			}else if(select.equals("3")) {
				userArrayList.removeUser();
				
			}else if(select.equals("q")) {
				System.out.println("프로그램 종료");
		    }else {
		    	System.out.println("해당 번호는 사용할 수 없는 기능입니다.");
		    }
		
	
		
		
		
		
		}
	}
		
		


}
