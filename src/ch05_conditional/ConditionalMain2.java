package ch05_conditional;

/**
 * class Name	: ConditionalMain2
 * Author		: SSAM
 * Created Date : 2025. 1. 24.
 * versopm	    : 1.0
 * Purpose		:[목적을 작성하세요]
 * Description  :조건식 switch
 */
public class ConditionalMain2 {

	public static void main(String[] args) {
		//switch 문은 단순 값을 매칭하느 경우 사용
		int num =1;
		switch(num) {			//swtich의 변수와 같을때 int num
		case 0 :
			System.out.println("수강응록");
			break;
		case 1:
			System.out.println("기초 프로그래밍");
		case 2:
			System.out.println("취업 관련");
			break;
		default :
			System.out.println("종료");
		}

	}

}
