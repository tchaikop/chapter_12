package chapter12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Test01 {
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> integer = new ArrayList<Integer>();
		 
		integer.add(10);
		integer.add(20);
		integer.add(30);
		integer.add(40);
		integer.add(50);
		
		for(int i=0; i<integer.size();i++) {
		System.out.println(integer.get(i));
		
		}
		System.out.println("=====");
		System.out.println(integer.get(2));
		
		System.out.println("=====");
		System.out.println(integer.size());
		
		integer.remove(1);
		
//		Iterator<Integer> iterator = integer.iterator();
	//	while(iterator.hasNext()) {
//		Integer int1 = iterator.hasNext();
//      System.out.println(int1);		
		// }
		
		ArrayList<String> str = new ArrayList<String>();
		str.add("홍길동");
		str.add("이순신");
		str.add("김유신");
		str.add("강감찬");
		
		
			if(str.contains("이순신")) {
				System.out.println("존재합니다.");
			} else {
				System.out.println("존재하지 않습니다.");
			}
			
			System.out.println("=====");
			
			HashSet<String> str1 = new HashSet<String>();
			
			str1.add("Java");
			str1.add("Spring");
			str1.add("Java");
			str1.add("React");
			str1.add("Spring");
			
			System.out.println(str1.size());
			
			System.out.println("=====");
			
			
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			
			map.put("홍길동",90);
			map.put("김철수",80);
			map.put("이영희",95);
			
			System.out.println(map.get("홍길동"));
			map.put("김철수",88);
			System.out.println("김철수: " + map.get("김철수"));
		
		
		
		
		
		

}
}
