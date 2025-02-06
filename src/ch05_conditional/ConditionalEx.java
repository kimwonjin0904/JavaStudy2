package ch05_conditional;

import java.util.Scanner;

public class ConditionalEx {
	
	public static void main(String[] args) {
		/*사용자로부터 숫자를 입력받아 짝수읹 ㅣ홀수인지 판별하시오
		 * 조건1:정수만 입력받음
		 * 
		 */
		
		//if문을 사용하여 짝수면 짝수 홀수면 홀수출력
		//1.입력받음(형변환 정수로int로)
		//2.조건식 if문과 연산자 operator 사용
		//3.출력 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요(정수)");
		System.out.print(">>>");
		int number =scan.nextInt();			
		if(number % 2 == 0) {
			System.out.println("짝수");
			
		}else {
			System.out.println("홀수");
			
		}
	}

}
