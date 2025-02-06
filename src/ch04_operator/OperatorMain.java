package ch04_operator;

import java.util.Scanner;

/**
 * class Name	: OperatorMain
 * Author		: SSAM
 * Created Date : 2025. 1. 23.
 * versopm	    : 1.0
 * Purpose		: 자바기초
 * Description  : 기본 연산자
 */
public class OperatorMain {
	public static void main(String[] args) {
		//1/증감 연산자 ++ or --
		int num = 10;
		num ++;
		//"문자열"+"문자열"=문자열
		//"문자열"+ "숫자형태"=문자열
		System.out.println("++이후" + num);
		num --;
		System.out.println("--이후" + num);
		//주의 (연산자전 후에 따라 다름)
		int a, b;
		a = num++;    //후
		b= ++num ;    //전
		System.out.printf("a:%d, b:%d,\n",a,b);  //여기는 printfln오류??
		
		//2.대입 연산자 +=, -=, *=, /=, %=
		int c = 1;
		c += 2; //c = c + 2
		System.out.println("c:" + c);
		c *=  10;  // c = c * 10;
		System.out.println("c:" + c);
		
		//3.산술 연산자 +, -, *, /, %(%는 나머지를 반환)
		//(a % b) = a를 b로 나눈 나머지 반환
		System.out.println(10 + 5);
		System.out.println(10 % 5);
		
		
		//4.비교 연산자  >, <, >=, !=, ==  (!= 같지 않다)
		int num1 = 10;
		int num2 = 20;
		System.out.println(" == 비교 연산자 ==");
		System.out.println("num1 : %d vs num2: %d\n, num1,num2");
		//비교 연산자는 연산 후 true, false를 리턴 (boolean 타입)
		System.out.println(num1 > num2);			//왼쪽을 기준으로 비교연산
		System.out.println(num1 < num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 != num2);
		System.out.println(num1 == num2);
		
		
		
		//5.삼항 연산자 (조건 연산자)
		// (a) ? (b) : (c) a의 조건식이 true 이면 b 아니면 c
		String msg = (a > 9) ? "a가 9보다 큼" : "9보다 작음";
		System.out.println(msg);
		System.out.println("아이디를 입력해주세요 (4자리 이상)");
		System.out.print(">>>");
		Scanner scan= new Scanner(System.in); 				//scanner Emt
		//사용자가 입력을 받아 조건이 맞으면 사용
		//				맞지 않으면 (4자리이상으로 다시 입력하세요)
		
		String userInput = scan.nextLine();
		int len = userInput.length();  				//문자열 길이
		System.out.println("문자열 길이:" +len);
		String output = 
				len >= 4 ? "사용 가능합니다." : "4자리 이상으로 다시 입력!";
		System.out.println(output);
		
		
		
		
		
		//논리연산자 %%(and연산) 들디 ture 일때 true
		//			||(or연산) 둘중 1개만 true 이면 true
		
		//아이디들 8~14길이만 사용가능 
		
		System.out.println("=== 논리 연산 ===");
		System.out.println("아이디를 입력하세요(8~ 14길이):");
		System.out.print(">>>");
		String userInput2 = scan.nextLine();
		int len2 = userInput2.length();
		String output2 = (len2 >= 8 && len2 < 15 ) ? "가능" : "불가능";
		System.out.println(output2);
		
		
		
		//성적이 90 이상 A , 80이상 B 나머지는 c
		//System.out.println("성적을 입력하세요:");
		//System.out.print(">>>");
		//String useInput3 = scan.nextLine();
		//int len3 = userInput.length();
		//String output3 = (len3 >= 90 && len3 >= 80 %% len3 >= 70) ? "A" : "B" : "C";
		//결과는 A 입니다, B입니다, C입니다
		//1.입력받기
		//2.형변환
		//3.조건식
		//4.결과 출력
		
	
		String userScore = scan.nextLine();
		int score = Integer.parseInt(userScore);
		String grade = (score >= 90) ? "A": 
						(score >= 80 ? "B":"C");
						
		System.out.println(grade + "입니다");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
