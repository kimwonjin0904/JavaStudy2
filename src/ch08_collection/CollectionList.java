package ch08_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * class Name	: CollectionList
 * Author		: SSAM
 * Created Date : 2025. 2. 4.
 * versopm	    : 1.0
 * Purpose		:[목적을 작성하세요]
 * Description  :arrayList
 */
public class CollectionList {

	public static void main(String[] args) {
		/*
		 * 컬렉션 프레임워크는 데이터를 보다 쉽게 다룰 수 있도록 재사용 가능한 
		 * 컬렉션 클래스르 제공함
		 * list,set,Map
		 * 1.List : 순서대로 객체를 저장하는 구조, 중복된 원소를 허용
		 * 		원소에 접근하기 위해 인덱스를 사용 (ArrayList, Linkerlist)
		 * 2.Map : key value 쌍으로 이루어진 객체를 저장하는 구조
		 * 			key는 중복될 수 없음 각 키는 하나의 값을 가리킴(HashMap,TreeMap)
		 * 3.Set : 중복을 허용하지 ㅇ낳는 객체의 모음 원소의 순서는 보장하지 않음(HashMap,TreeMap)
		 * */
		//동적배열(크키가 자유로움)
		ArrayList<String> students = new ArrayList<>();
		students.add("팽수");			//add메소드요소추가
		students.add("길동");
		students.add("동길");
		System.out.println(students);
		System.out.println(students.get(1)); 	//get(인덱스) 인덱스로 데이터 접근
		students.set(1,"팽순");					//set(인ㄷ게스, 변경값) 수정	
		System.out.println(students.size());		//리스트 요소 수
		System.out.println(students.isEmpty());
		students.remove("동길");		//해당값이 있으면 삭제 없으면 아무일도 안 일어남 /동길이 있기 때문에 clear???
		students.clear();            //리스트 비움
		System.out.println(students);
		
		students.add("강지석");
		students.add("김도래");
		students.add("김병준");
		students.add("김서영");
		students.add("김소연");
		students.add(	"김원진");
		students.add("박정단");
		students.add("박종욱");
		students.add("신미정");
		students.add("정지나");
		students.add("최보석");
		
		for(int i =0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		//향상된 for문 (value만 필요할때)
		System.out.println("========");
		for(String str:students) {
			System.out.println(str);
		}
		//1.List 복사	
		ArrayList<String> stu = students;
		stu.set(0,"지석");
		System.out.println(students);
		System.out.println(stu);	//얕은 복사는 주소를 복사(공유) 하기때문에 둘다같은
		//2.깊은 복사1
		ArrayList<String> stu2 =new ArrayList<>(students);
		//2.깊은 복사 2
		ArrayList<String> stu3 = new ArrayList<>();
		stu3.addAll(students);
		stu2.set(0,"kang ji suk");			
		stu3.set(0,"ji suk");
		System.out.println(students);
		System.out.println(stu2);
		System.out.println(stu3);
		
		//정렬
		//default 오름차순 숫자 < ABC < abc > 가나다~
		Collections.sort(stu3);
		System.out.println(stu3);
		//내림차순 정렬(오름차순 바대로 정렬)
		Collections.sort(stu3, Comparator.reverseorder());		//오류
		System.out.println(stu3);
		
		//선언 & 값 할당
		ArrayList<Integer> numbers =
				new ArrayList<>(Arrays.asList(10,20,11,190,99,1));
		//<> <-- 이 부분은 제네릭 이라하며 코드에서 타입의 안저성을 보장할 수 있으며
		//부필요한 캐스팅을 줄이기 위해 만들어짐, 제네릭은 객체만 담을 수 있음
		//기본 타입(int, folat ,boolaen)은 Wrapper class사용 Integer, BOolean..
		System.out.println(numbers);
		Collections.sort(numbers);
		System.out.println(numbers);
		for(int num :numbers) {
			System.out.println(num);
		}
		
		
	}
}
