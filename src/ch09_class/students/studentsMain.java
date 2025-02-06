package ch09_class.students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class studentsMain {

	public static void main(String[] args) {			///String[]
		Student stu1 = new Student("팽수"); //new 클래스를 사용하기 위해 인스턴스화  new Student("이름을 써야 오류 안남");
		Student stu2 = new Student("팽순"); 								//stu1.name오류 privata public는 가능
		Student stu = new Student();
		System.out.println(stu1);
		System.out.println(stu1.getName());//팽수
		stu1.setName("김팽수");
		System.out.println(stu1.getName());//김팽수
		System.out.println(stu2.getName());//팽순
		stu1.setKor(90);
		System.out.println(stu1);
		stu1.setEng(75);
		System.out.println(stu1);
		stu1.nm();
		Student.check();  		//정적 메소드 호출
		//Student.nm();  --> 호출 안됨 static method만 가능   // class의 기본 메소드는 인스턴스 메소드임 (인스턴스화 이후 사용가능)
		
		ArrayList<Student> classMate = new ArrayList<>();
		classMate.add(stu1);
		classMate.add(stu2);
		classMate.add(new Student("닉",100,90,80));
		classMate.add(new Student("주디",100,90,80));
		for(Student st : classMate) {
			System.out.println(st);		//toString이 있어햐 출력됨
		}
		//버블정렬
		for(int k =0; k< classMate.size() -1; k++) {
			for(int i =0; i < classMate.size() -1; i++) {
				//i < i+1내림
				//i > i+1오름
				if(classMate.get(i).getAvg() > classMate.get(i+1).getAvg()) {
					Student temp = classMate.get(i);			// 임시 공간에 
					classMate.set(i, classMate.get(i+1));		//i번째와 순서 바꾸기
					classMate.set(i+1, temp);
				}
			}
		}
		System.out.println(classMate);
		//Conllections.sort 객체 사용
		//-1 : 두 객체의 순서를 바꾸지 않음 
		// 1 : 두 객체의 순서를 바꿈
		// 0 : 유지
		Collections.sort(classMate, new Comparator<Student>(){
			@Override
			public int compare(Student o1, Student o2) {
				double diff = o2.getAvg() - o1.getAvg();
				if(diff < 0) {				// >오름차순, <내림차순
					return -1;
				}
			return 1;		//차이가 0보다 크면 o2가 더크기 때문에 순서를 바꿈
			}
			
		});
		System.out.println(classMate);
	}
