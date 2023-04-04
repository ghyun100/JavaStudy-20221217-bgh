package j17_컬렉션.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main2 {

	public static void main(String[] args) {
		
		
		Map<String, Object> datamap = new HashMap<String, Object>();
		
		datamap.put("count", 1118);
		datamap.put("next", "https://url");
		datamap.put("previous", null);
		
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		
		
		
		Map<String, String> info = new HashMap<String, String>();
		
		info.put("name", "bulbasaur");
		info.put("url", "abc1");
		
		Map<String, String> info2 = new HashMap<String, String>();
		
		info2.put("name", "ivysaur");
		info2.put("url", "abc2");
		
		Map<String, String> info3 = new HashMap<String, String>();
		
		info3.put("name", "venusaur");
		info3.put("url", "abc3");
		
		list.add(info);
		list.add(info2);
		list.add(info3);
		
		datamap.put("result", list);
				
		System.out.println(datamap);
	}

}
