package j17_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DIctionary1 {

	public static void main(String[] args) {
		
		
//		List<String> arrayList = new ArratList<String>();
		
		Map<String ,String> dict = new HashMap<String, String>();
		
		dict.put("축구", "축구 -> soccer");
		dict.put("야구", "야구 -> baseball");
		dict.put("농구", "농구 -> basketball");
		dict.put("골프", "골프 -> golf");
		
		
		Scanner scanner = new Scanner(System.in);
		String searchText = null;
		
		while(true) {
			System.out.println("[사전 검색기능]");
			System.out.println(" # 프로그램 종료명령(exit)");
			
			System.out.println("검색어 :");
			searchText = scanner.nextLine();
			
			if(searchText.equals("exit")) {
				System.out.println("프로그램 종료");
			break;
			}else if(dict.containsKey(searchText)) {
				System.out.println(dict.get(searchText));
			}else {
				System.out.println("지원하지 않는 단어입니다.");
			}
			
		}
		
		/*
		 * 축구 -> soccer
		 * 야구 -> baseball
		 * 농구 -> basketball
		 * 골프 -> golf
		 * 
		 */
		
	}

}
