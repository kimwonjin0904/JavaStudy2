package ch09_class.util;

/**
 * class Name	: UtilClass
 * Author		: SSAM
 * Created Date : 2025. 2. 5.
 * versopm	    : 1.0
 * Purpose		:[목적을 작성하세요]
 * Description  :static 메소드
 */
public class UtilClass {

	/*
	 * public static 정적 메소드는 어디서든 사용할 수 있는 메소드(해당 클래스를 인스턴스화 하지 않아도)
	 * 공동기능과 같은 부분을 정의해서 사용할때 만드는 클래스
	 * */
	//num : 반올림 하고자하는 소수, n:소수 n번째 자리까지
	public static double weRound(double num, int n) {			//weRound 소수점 평균낼때 소수점 잘라서 쓰는
		int ten =1;
		for(int i=0; i<n; i++) {
			ten *=10;
		}
		num *=ten;
		long temp = Math.round(num);
		double result = (double) temp/ten;
		return result;
	}
	public static void main(String[] args) {
		System.out.println(weRound(75.31928479283,3)); 		//3은 소숫점 3자리
	}
}
