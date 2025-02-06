package ch01_variable;

public class Casting {
	
	public static void main(String[] args) {
		//작은 단위 . 큰 단위 형 변환은 자동
		int a= 10;
		double b = a;
		
		//큰단위 . 작은단위는 형변환해야함
		double c= 10.5;
		int d = (int) c; //ctrl +1 //명시적 변환 알아서 적용해줌
		
		//타입 변환
		//정수 to 문자열
		int num = 123;
	    String str = String.valueOf(num);
	    System.out.println(num);//문자열타입으로
	    
	    //문자열 to 정수
	    String str2 = "123";
	    int num2 = Integer.parseInt(str2);
	    System.out.println(num2);
	   
		
	}

}
