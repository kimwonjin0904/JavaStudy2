package ch05_conditional;

import java.util.Scanner;

/**
 * class Name	: LoopWhile
 * Author		: SSAM
 * Created Date : 2025. 1. 24.
 * versopm	    : 1.0
 * Purpose		:[목적을 작성하세요]
 * Description  :반복문 while
 */
public class LoopWhile {

	public static void main(String[] args) {
		//while (조건식) 조건식 true이면 반복(주의 무한루프)
		int i= 1;
		while(i<= 10 ) {
			System.out.println(i);
			i++; 						//빼먹을시 무한루프
		}
	Scanner scan = new Scanner(System.in);
	boolean flag = true;
	while(flag) {						//while(true)도 가능
		System.out.println("===========");
		System.out.println("이름을 입력하세요(종료)q");
		String nm = scan.nextLine();
		if(nm.equals("q")) {
			flag = false;  				//break;도가능		
		}else {
		System.out.println(nm + "님 환영합니다");
		}
		System.out.println("=============");
	}
	//while문으로 구구단 2~9단을 출력
	//1.  2~9단 while문 작성
	//2.  1~9수 에 해당되는 while문 작성
	//변수 scope 주의
	int dan = 2;
	while(dan <= 9) {
	int su = 1;
		System.out.println(dan+"단");
		while(su <= 9) {
			System.out.printf("%d x %d = %d\n", dan, su, (dan*su));
			su ++;
		}
		dan++;
	}
	
	
	
	
	
	
	
	
	
	}

}
