package j17_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class StringMap {

	public static void main(String[] args) {
		HashMap<Integer, String> strMap = new HashMap<Integer, String>();
		
		/*
		 * Map의 특징
		 * 1.Key 와 Value 값을 가진다.
		 * 2.중괄호({})로 묶이고 key와 value는 등호(=)로 구분하고,
		 *   key, value 쌍은 콤마(,)로 구분한다.
		 * 3.순서가 없다. -> 반복을 못돌린다.
		 * 4. 중복을 허용하지 않는다.(key의 중복은 안되고, value의 중복은 허용)
		 *  
		 */
		
		
		strMap.put(1, "java");
		strMap.put(1, "java");
		strMap.put(1, "java");
		strMap.put(1, "java");
		
		
		strMap.put(1, "java1");
		strMap.put(1, "java2");
		strMap.put(1, "java3");
		strMap.put(1, "java4");
		

		strMap.put(20, "java1");
		strMap.put(30, "java2");
		strMap.put(40, "java3");
		strMap.put(50, "java4");
		
		
		strMap.put(2, "java");
		strMap.put(3, "java");
		strMap.put(4, "java");
		strMap.put(5, "java");
		
		
		
//		System.out.println(strMap);
		
		Iterator<Integer> irKey = strMap.keySet().iterator();
		
		while(irKey.hasNext()) {
			System.out.println(strMap.get(irKey.next()));
		}
		
		
		//밑에 오류남, 맵은 무조건 Iterator로 돌려줘야함.
//		for(String value : strMap) {
//			
//		}
	
		//키값중에 해당하는 key값이 있는지 보기
		System.out.println(strMap.containsKey(30));
		System.out.println(strMap.containsKey(15));
		
		//벨류중에 해당하는 value값이 있는지 보기
		System.out.println(strMap.containsValue("java3"));
		System.out.println(strMap.containsValue("python"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
