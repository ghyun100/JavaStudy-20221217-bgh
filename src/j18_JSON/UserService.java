package j18_JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserService {

	public static User createUser() {
		
		List<String> hobby = new ArrayList<String>();
		//실습
		//hobby에 배열로 축구, 농구, 야구, 골프 넣기
		hobby.addAll(Arrays.asList(new String [] {"축구", "농구", "야구", "골프"}));
		
		
		
		User user = User.builder()
				.userCode(1)
				.username("yeonho")
				.password("1234")
				.name(null)
				.address("부산 광역시 진구")
				.phone("010-3300-4698")
				.hobby(hobby)
				.build();
		
		return user;
	}

}
