package cho1_variable;

public class VariableName {
	public static void main(String[] args) {  	// ctrl + 스페이스바
		/*
		 * 여러 줄 주석
		 * 변수 클래스 명명 규칙
		 * 프로젝트, 클래스명 이름은 앞에 대문자를 씀(JavaStudy)
		 * 패키치(폴더) 이름은 전부 소문자로 작성
		 * 필요하다며 ㄴ단어 사이에 언더바(_)를 넣어서 사용(ch01_variable)
		 * 
		 * 변수명(or 함수명[메소드])
		 * java는 카멜표기법(Came1, 낙타 표기법이라 함 울룩불룩)
		 * 첫글자는 소문자, 다음 단어들은 대문자로 시작
		 * ex) todayIsHappy
		 * 
		 * 나중에 배울 python은 스네이크 표기법사용
		 * ex) today_is_happy
		 * 
		 */
		//[데이터 타입] [변수명]
		int todayIsHappy = 0;
		todayIsHappy = todayIsHappy + 10;
		System.out.println(todayIsHappy); //f8이 끝 디버그as
	}


}
