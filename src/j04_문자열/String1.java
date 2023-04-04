package j04_문자열;

public class String1 {

	public static void main(String[] args) {
//		String은 기본자료형이 아니다.
//		문자와 문자열 'A',"안녕"
		
		System.out.println("안녕하세요");
		System.out.println("\"안녕\"하세요");
		
//		java이스케이프 문자(구글검색) 외우면좋을 듯
//		\" : "출력
		
		System.out.println("안녕\t하세요");
//		\t : 탭만큼 띄어짐
		
		String address = "부산시 진구 가야동";
//		                  0 1 2 3 4 5
//		띄어쓰기도 세줘야한다.
		int index = address.indexOf("시");
		System.out.println(index);
		
		int index2 = address.indexOf("진");
		System.out.println(index2);
		
		String address2 = "부산시 동래구 사직동";
		int index3 = address2.indexOf("동");
		System.out.println(index3);
//		indexOf는 앞에서부터 찾음(address에동이 두 개)
		
		int index4 = address2.lastIndexOf("동");
		System.out.println(index4);
		
//		이런걸 인덱싱이라고 함(검색)
//		int num = 8;
//		num. 
//		int는 기본자료형이라 점을 눌러도 뭐가 안뜸
	
		String subAddress = address2.substring(0, 3);
//		substring : 잘라라
//		(0,3)이면 3전까지 보여줘
		System.out.println(subAddress);
		
		String subAddress2 = address2.substring(0, 4);
		System.out.println(subAddress2);
	
		String subAddress3 = address2.substring(4);
		System.out.println(subAddress3);
		
//		address2.sub까지만 쳤을 때는 그부분부터 끝까지
		
//		indexOf란? : 문자열에서 해당 문자열의 값을 찾아 위치를 알려줌
//		substring이란? : 해당 문자열에서 범위를 지정하여 문자열을 잘라줌
		
		
//		문제 :
//		"부산광역시 서구 부민동"에서 indexOf, lastIndexOf를 사용해서 "부산광역시 서구"까지 출력
		
		
		
		String address4 = "부산광역시 서구 부민동";
		
		int index5 = address4.indexOf("부");
		int index6 = address4.lastIndexOf(" ");
//		or lastIndexOf("부")라 쓰고 index6-1
		String subaddress4 = address4.substring(index5,index6);
		System.out.println(subaddress4);
		
//		replaceAddress(replace) : 문자형을 바꿔줌
//		replaceAddress(replaceAll) : 해당 문자열을 찾아서 다른 문자열로 바꿔주는 기능

		String replaceAddress = address4.replace(' ', '-');
		System.out.println(replaceAddress);
	    
		String replaceAddress2 = address4.replaceAll("부산", "-");
		System.out.println(replaceAddress2);
		
		
		
//		구글에 백준검색 => 단계별 풀어보기
		
		String phoneNumbers = "010/3300/4698, 010/1234/5678";
		
	
//		문제 : 010을 011로 다 바꿔라, /를 - 으로 바꿔라, (,)를 /로 바꿔라
		
		
		String replacephoneNumbers = phoneNumbers.replaceAll("010", "011"); 
		System.out.println(replacephoneNumbers);
		replacephoneNumbers = replacephoneNumbers.replace('/', '-');
		System.out.println(replacephoneNumbers);
	    replacephoneNumbers = replacephoneNumbers.replaceAll(",", "/");
		System.out.println(replacephoneNumbers);
		
		
		String replacephoneNumbers1 = phoneNumbers.replaceAll("010", "011")
				.replaceAll("/", "-")
				.replaceAll(",", "/");
		System.out.println(replacephoneNumbers1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
		
		
		
		
		
		
		
		
		
	
	
	
	}

}
