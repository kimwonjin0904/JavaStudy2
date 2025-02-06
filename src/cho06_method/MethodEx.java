package cho06_method;

public class MethodEx {

	public static void main(String[] args) {
		//이름 국어 수학 영어 점수 입력 평균 등ㄱ브 출력 메소드 작성
		//인풋 스트링 인트
		//아웃풋 없음
		//등급은 에이이상 에이 80이상 비 나머지 씨
		//출력 ...은 평균은 95.0으로 에이등급
		//함수호출 예
		makeCard("김원진",100,95,100);
	}
	//1.메소드정의
	public static void makeCard(String nm, int kor, int eng, int math) {
		//2.점수계산
		double avg = (kor + eng + math) /3.0;
		//3.등급 조건식
		String grade = "c";
		if(avg >= 90) {
			grade = "a";
		}else if(avg >= 80) {
			grade = "b";
		}
		//4.출력
		System.out.printf("%s님의 평균은 %.2f으로 %s등급 입니다",nm,avg,grade);
	}
}