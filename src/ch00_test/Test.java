package ch00_test;


import java.util.Scanner;   			//scanner class

public class Test {
	
	public static void main(String[] args) {
		/*사용자로부터 숫자를 입력받아 짝수읹 ㅣ홀수인지 판별하시오
		 * 조건1:정수만 입력받음
		 * 
		 */
		
		//if문을 사용하여 짝수면 짝수 홀수면 홀수출력
		//1.입력받음(형변환 정수로int로)
		//2.조건식 if문과 연산자 operator 사용
		//3.출력 
		
		Scanner scan = new Scanner(System.in);        		//컨트롤 쉬프트 o , 컨트롤 1    
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
		
		//Scanner scan = new Scanner(System.in);  
		//System.out.println("숫자를 입력하세요(정수)");
		//System.out.print(">>>");
		//int num = Interger.parseInt(scan.nextLine());
		//if(number % 2 == 0) {
			//System.out,printf("%d는 %s 입니다",num, "짝수");
			//else {
				//System.out,printf("%d는 %s 입니다",num, "홀수");
		//	}
		//}
//	}
		
		
		
		
		
		
		
		
		
// int number;
// printf("x의 값은?");
//scanf("%s",%&);
//if(number %2 == 0){
// printf("짝수");
//}else
//printf("홀수");
//