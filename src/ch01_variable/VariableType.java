package ch01_variable;
// 컨트롤 h
/**
 * class Name	: VariableType
 * Author		: SSAM
 * Created Date : 2025. 1. 22.
 * versopm	    : 1.0
 * Purpose		:[목적을 작성하세요]
 * Description  :변수 타입
 */
public class VariableType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수의 타입
		//정수의 타입
		
		byte byteVar = 1;
		short shortVar = 2;
		int intVar = 3;
		long longVar = 30000000L;
		
		//정수이면서 문자
		char charVar = 44032; //'가'와 같음
		
		//소수 타입
		float floatVar = 3.14f;
		double doubleVar = 3.14;
		
		//불리언 타입(참/거짓)
		boolean boolVar = false;
		
		//문자열 타입
		String strToday = "오늘은 1월 22일";
		
		System.out.println(doubleVar);
		
		//Ctrl + d 라인 삭제
		//Ctrl + Alt + 아래방향키 라인복사
		//Alt _  위 아래 (라인 이동)
		//정렬 영역선택 후 ctrl _ shift +f
	}

}
