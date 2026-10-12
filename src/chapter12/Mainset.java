package chapter12;

import java.util.HashSet;

public class Mainset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashSet<Student> studentSet = new HashSet<Student>();  // Arraylist 랑 같은데 순서가 없고,
		                                                       // 중복이 불가 한다
		                                       // index 가 없어서 for(int i ...) 사용이 불가,
		                                  // get(0) 이런거 사용 불가
		
		
//		Set<Student> set = new HashSet<Student>();
//		
		Student stu1 = new Student();
		stu1.name="홍길동";
		
		
		
		
		studentSet.add(stu1);
		
		System.out.println(studentSet);
		
		
		
		
	}

}
