package chapter12;

import java.util.ArrayList;
import java.util.List;

public class Mainstudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu1 = new Student();
		
		stu1.age = 19;
		stu1.grade = 3;
		stu1.name = "홍길동";
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(stu1);  // index  0 에서 시작
		students.add(stu1);
		students.add(stu1);
		students.add(stu1);
		
		students.remove(2);
 		
		
//		List<Student> studentlist = new   list는 인터페이스 이니까 인스턴스화 안된다
		ArrayList<Student> studentlist = new ArrayList<Student>();  // 꺽쇠를 제네릭이라고 한다
		List<Student> list = new ArrayList<Student>();
		list = studentlist;  // 업캐스팅
		
		studentlist.add(stu1);  // index 0
		studentlist.add(stu1);
		studentlist.add(stu1);  // 중복허용
		
		studentlist.get(1);
		studentlist.size();
		
		for(int i=0;i<studentlist.size();i++) {
			System.out.println(studentlist.get(i));
		}
		
		for(Student student:studentlist) {
			System.out.println(student.name);
		}
		
		// Arraylist는 add(), remove, set(수정), get, size  :  5개 만 알아랏
		
		studentlist.contains(stu1);  // 해당 값이 포함 되 어 있는지를 아는 거
		
		
		
		

	}

}
