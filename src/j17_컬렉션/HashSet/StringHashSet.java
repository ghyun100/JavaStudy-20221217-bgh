package j17_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class StringHashSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("java");
		set.add("java");
		set.add("java");
		           
		set.add("python");
		set.add("python");
		set.add("python");
		set.add("python");
		
		set.add("1");
		set.add("2");
		
		System.out.println(set);
		
		
		Iterator<String> ir = set.iterator();
		
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
//		
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
//		
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
//		
//	    System.out.println(ir.hasNext());
//	    System.out.println(ir.next());
//		
//		System.out.println(ir.hasNext());
		
//		while(ir.hasNext()) {
//			System.out.println(ir.next());
//		}
		
		while(ir.hasNext()) {
			String str = ir.next();
			if(str.equals("python")) {
				System.out.println(str);
			}
		}
		//equals = 값비교, == 은 주소비교
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
