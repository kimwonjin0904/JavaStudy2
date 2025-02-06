package cho06_method;

/**
 * class Name	: MethodMain
 * Author		: SSAM
 * Created Date : 2025. 1. 31.
 * versopm	    : 1.0
 * Purpose		:[목적을 작성하세요]
 * Description  :자바의 함수 (클래스에 종속되어 있는 method)
 */
public class MethodMain {
	//main 메소드 public 이며 static 하여 어디서든 사용가능하고
	//void라 리턴이 없으며 매개변수 한개 String [](배열 타입)
	public static void main(String[] args) {
		printSum(1,100);	
		printSum(3,140);
		printSum(1,120);//method실행(반복되는 작업)
		System.out.println(retuntSum(1,50));
		int result = retuntSum(2,4);
		System.out.println(result);
		
		print("안녕하세요");
		print(10);
		print(10.41);
		print(factorial(15));
	}
	
	//2개의 정수를 입력 받아 출력하는 함수 
	public static void printSum(int from, int to) {
		int sum = 0;
		for(int i = from; i <= to; i++) {
			sum+=i;
		}
		System.out.printf("from : %d부터 to: %d 까지 합은: %d\n",from,to,sum);
	}
	public static int retuntSum(int from, int to) {
		int sum = 0;
		for(int i = from; i <= to; i++) {
			sum+=i;
		}
		return sum; //리턴 타입이 맞아야함 
	}
	public static void print(String msg) {
		System.out.println(msg);
	}
	public static void print(int msg) {
		System.out.println(msg);
	}
	public static void print(double msg) {
		System.out.println(msg);
}
	//팩토리열 메소드를 만드시오
	//input : int
	//output: long
	//method name : factorial
	public static long factorial(int num) {
		long result =1;
		for(int i = 1; i <=num; i++) {
			result *=i;
		}
		
		return result;
	}
}

