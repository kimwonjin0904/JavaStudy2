package ch05_conditional;

/**
 * class Name	: ConditionalMain
 * Author		: SSAM
 * Created Date : 2025. 1. 23.
 * versopm	    : 1.0
 * Purpose		:[목적을 작성하세요]
 * Description  :조건문 if
 */
public class ConditionalMain {

	public static void main(String[] args) {
		int score ;
		score = 92;
		String grade = "";
		if(score >=90){
			grade = "A";
			
		}else if (score >= 80) {
			grade = "B";
			System.out.println("조건이 true");
			
		}else {
			grade = "C";
		}
		System.out.println(score + "는" + grade);
		
		
		
		//변수의 scope
		int price = 3000;
		int myMoney = 1000;
		//String message
		if(price > myMoney) {
			System.out.println("돈이 부족합니ㅏㄷ...");
			//msg = ("돈 부족");
		}else {
			System.out.println("돈이 충분합니다.");
			//msg = ("돈 충분");
		}
		//System.out.println(msg);
		
		
		
		
		//중첩 if 가능 if문 안에 if문
		//조건 1: 이름은 1글자 이상
		//조건 2:전화번호는 10 or 11 자리\
		//조건1이 만족하지 않으면 가입 실패
		
		String nm = "닉";
		String phone = "0101234567";
		if(nm.length() >=1) { 			//1글자 이상일때 nmlength실행
			if(phone.length() ==10 || phone.length() ==11) {    //조건2 || ㅣor 또는의 의미
				System.out.println("환영합니다");
			}
		}else {
			System.out.println("가입 실패!!");
		}
		
		
		//1/스캐너(scanf??),스트링 쓰느 이유
		//2.if문 안에if문
		
		
		
		
		
		
		
		
		
	}

}


