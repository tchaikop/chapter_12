package chapter12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//			Iterator  반복자
		// 컬렉션에 들어 있는 데어터를 하나씩 꺼내서 확인을 할 수 있게 하는 도구 
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("홍길동");
		names.add("이순신");
		names.add("김유신");
		names.add("강감찬");
		
//		Iterator iterator = (Iterator) names.iterator();
		
//		Iterator<String> iterator = names.iterator();
//		
//		while(iterator.hasNext()) {
//			String name = iterator.next();  // 다음 위치로 이동해서 다음 값을 가져온다
//			System.out.println(name);
//		}
//		
//		for(String name:names) {
//			System.out.println(name);
//			
//		}
		
		ArrayList<Student> studentlist = new ArrayList<Student>();
		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();
		Student stu4 = new Student();
		
		stu1.name= "홍길동";
		stu2.name= "이순신";
		stu3.name= "김유신";
		stu4.name= "강감찬";
		
		studentlist.add(stu1);
		studentlist.add(stu2);
		studentlist.add(stu3);
		studentlist.add(stu4);
		
		Iterator<Student> iterator = studentlist.iterator();  // <  >  이걸 제네릭이라고 하는데,
		                                                     //이 자료형에 맞지 않는 데이터는 받지 않는다
		
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.name);
		}
		
	}

}
