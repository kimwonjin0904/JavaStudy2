package ch05_conditional;

/**
 * class Name	: LoopFor
 * Author		: SSAM
 * Created Date : 2025. 1. 24.
 * versopm	    : 1.0
 * Purpose		:[목적을 작성하세요]
 * Description  :반복문 for
 */
public class LoopFor {
	public static void main(String[] args) {
		//for문 (1.초기화식; 2.조건식; 3.증강식){
		//	3.실행문
		//} 
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		//1~10까지의 합은?
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum +=i;
	}
		System.out.println("1~10까지 더하면:"+ sum);
		//21~45까지의 합은?
		int sum2=0;
		for(int i =21; i<=45;i++) {
			sum2 +=i;
		}
		System.out.println("21부터~45까지 더하면?"+sum2);
		
		
		
		//1~40까지 중에 짝수만 더한 값은?
		//1~40반복문 만들기
		//조건식(짝수일때만)
		//출력
		int sum3 =0;
		int number = 0;
		for(int i = 1; i <= 40; i++) {
		//	System.out.println(i);
			if(i % 2 ==0) {
				sum3 +=i;
				System.out.print(i);
				System.out.print("  ");
			}
		}
		
		System.out.println("1~40까지 중 짝수의 합은:"+sum3);
		
		
		
		
		
		
		
		//구구단 출력
		int dan = 9;
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d =%d \n", dan, i, dan*i);
		}
		
		
		//2단9단출력
		//각 단마다 1~9까지 곱하기 
		//1. 단증가 for문
		//2.  1~9곱하기 for문
		//3.출력
		
		for(int i =2; i<=9; i++) {
			if(i == 5) {			//5단은 제외(continue)
			//	continue;			//continue를 만나면 아래 실행문을 건너뜀  2~9단중에서 5단빼고 실행
				break;				//해당 for문 즉시 종료 아래 실행 되지 않음( 5단전까지만 실행)
			}
			System.out.println("==" + i + "단==");
			
			
			for(int j = 1; j <= 9; j++) {
			//	if(j ==5) {
				//	break;   							
				}
				System.out.printf("%d x %d = %d\n",i,j,i*j);
			}
		}
		//1~n까지 더한 값이 100이상이 되는 지점의 n을 구하시오
		int num5 = 0;
		for(int i = 1; i <= 9999; i++) {
			num5 +=1;
			if(num5 >= 100) {
				System.out.println("100이상이 되는 n:"+ i);
				break;
		}
		}
		//중첩 for문에서 서브 for문 시점에 특정 시점의 반복을 중단하는 
		//label(for문의 제어흐름을 전달)
		
		int sum6 = 0;
		outer:
			for(int i = 2; i <= 9; i++ ) {
				for(int j = 1; j <= 9; j++) {
					sum6 = i * j;
					System.out.printf("i:%d, j:%d, i*j%d",i,j,sum6);
					if(sum6 >= 50) {
						break; 			//sub for문 중단
										//break outer;  --outer해당 for문 즉시 증단
					}
				}
					if(sum6 >= 50) {
						break outer;
			}
}
}




//10부터 -> 1로감소
for(int q= 10; q>=1; q-- ) {
	System.out.println(q);
}
//5씩증가
for(int q= 1; ㅂ <= 100; q+= 5 ) {
	System.out.print(q);
	System.out.print(" ");
}
