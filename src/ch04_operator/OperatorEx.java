package ch04_operator;

import java.util.Scanner;

/**
 * class Name	: OperatorEx
 * Author		: SSAM
 * Created Date : 2025. 1. 23.
 * versopm	    : 1.0
 * Purpose		:[목적을 작성하세요]
 * Description  :연산자 연습문제
 */
public class OperatorEx {
	public static void main(String[] args) {
		//사용자에게 이메일 주소를 입력받으세요
		//email 형식이 아니면 이메일 형식이 아닙니다!"
		//email 형식이면 "사용가능"을 출력 (기준은 @ 포함여부)
	
		
		//1.입력받기 2.email 형식 체크 (문자열 함수에서 특정 문자열이 인덱스르 가져오는 )  3.메세지 출력
		//== <-- 같으면 true 리턴 
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.printf(">>");
		String email = scan.nextLine();
		String message = (email.indexOf("@") == -1) ? "형식이 아닙니다.! " : "사용가능";
		System.out.printf("고객님의 입력:%s 은 %s", email, message);
	
		
	}

}
