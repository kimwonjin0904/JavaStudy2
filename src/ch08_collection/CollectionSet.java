package ch08_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * class Name	: CollectionSet
 * Author		: SSAM
 * Created Date : 2025. 2. 4.
 * versopm	    : 1.0
 * Purpose		:[목적을 작성하세요]
 * Description  :Set
 */
public class CollectionSet {

	public static void main(String[] args) {
		//set은 중복이 있으면안됨 예를 들어 로또번호(순서가 유지되지 않음)
		Set<String> sets = new HashSet<>();
		sets.add("a");
		sets.add("b");
		sets.add("c");
		sets.add("a");
		System.out.println(sets);  					//실행시 ->[a,b,c]
		
		//for문
		for(String str: sets) {							//for문실행시
			System.out.println(str);					//a,b,c,세로로 출력
		}												
		System.out.println(makeLotto()); 	 //로또 번호 출력하려면 써야함			
		Set<Integer> myLotto = makeLotto();	
		//set to list
		ArrayList<Integer> lotto = new ArrayList<>(myLotto);
		Collections.sort(lotto);
		System.out.println(lotto);
	}												
													
	public static Set<Integer> makeLotto(){
		Set<Integer> lotto = new HashSet<>();
		//1~45사이의 랜덤값 6개 생성
		while(lotto.size()< 6) {
			int num = (int) ((Math.random() * 45) + 1);
			lotto.add(num);
		}
		return lotto;
	}
}
