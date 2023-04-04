package j18_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Gson4 {

	public static void main(String[] args) {
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("name", "최연호");
		jsonObject.addProperty("address", "부산 광역시 진구");
		jsonObject.addProperty("phone", "010-3300-4698");
		jsonObject.addProperty("code", 2);
		//map보다 많이 씀(이유 : 자료형을 따로 안써줘도 됨.)
		
		String json = gson.toJson(jsonObject);
		System.out.println(json);
		System.out.println(jsonObject);
		
		JsonObject jsonObj = gson.fromJson(jsonObject, JsonObject.class);
		System.out.println(jsonObj);
		
		
		
		
		
	}

}
