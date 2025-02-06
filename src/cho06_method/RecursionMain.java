package cho06_method;

/**
 * class Name	: RecursionMain
 * Author		: SSAM
 * Created Date : 2025. 1. 31.
 * versopm	    : 1.0
 * Purpose		:[목적을 작성하세요]
 * Description  :재귀함수 
 */
public class RecursionMain {

	public static void main(String[] args) {
		System.out.println(recFactorial(3));
		Func(10);
	}
	
	//factorial 재귀함수 화룡ㅇ
	public static long recFactorial(int num) {
		if(num == 1) {	//num이 1이 되면 1을 리턴
			return 1;
		}
		
		//3을 입력하면 
		//3*recFactorial(2)
		//3 * 2 * recFactorial(2)
		return num *recFactorial(num-1);
	}
	//재귀함수는 멈추는게 중요함
	public static void Func(int num) {
		if(num == 0) {	//멈추는 조건없으면 stackoverflow
			return;
		}else {
		System.out.println("hi");
		Func(num - 1);
		}
	}
}
