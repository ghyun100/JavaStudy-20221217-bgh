package j18_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson2 {

	public static void main(String[] args) {
		
		User user = UserService.createUser();
		//return이 user라서 가능
		
		Gson gson = new GsonBuilder().serializeNulls().setPrettyPrinting().create();
		//객체를 JSON으로 변환
		String userJson = gson.toJson(user);
		
		System.out.println(userJson);
		
		//JSON을 객체로 변환 -> fromJson(json문자열, 변환할 객체 클래스)
		User userObj = gson.fromJson(userJson, User.class);
		System.out.println(userObj);
		
		
		
		//실습1
		//userJson에서 주소(부산 광역시 진구) 가져오기
		
		
		
		//실습2
		//userObj에서 주소(부산 광역시 진구) 가져오기
		
		System.out.println(userObj.getAddress());
		
		
		
		
	}

}
