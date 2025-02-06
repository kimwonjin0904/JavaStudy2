package ch08_collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * class Name	: CollectionMap
 * Author		: SSAM
 * Created Date : 2025. 2. 5.
 * versopm	    : 1.0
 * Purpose		:[목적을 작성하세요]
 * Description  :Map
 */
public class CollectionMap {

	public static void main(String[] args) {
		//map 가장 많이 사용 데이터 구조중 하나
		//key와 balue 한쌍인 데이터
		HashMap<String,String> stuMap = new HashMap<>();
		//<key 문자열,  value문자열>
		stuMap.put("첫째","길동");
		stuMap.put("둘째","동길");
		stuMap.put("셋째","길수");
		System.out.println(stuMap);
		System.out.println(stuMap.get("둘째"));	//key로value가져오기
		stuMap.put("둘째", "동수"); //동일 key면 수정이됨key는 유니크함
		System.out.println(stuMap.size());	//순서는 보장하지 않지만 사이즈는 가져옴  ???굳이 쓰눈이유
		System.out.println(stuMap.containsKey("첫째"));		//해당 key가 있으면 true 없으면 false
		System.out.println(stuMap.containsValue("동길"));		//해당 value가 있으면 true없으면 false
		System.out.println("-------");
		
		//map은 keySey으로 for문 사용
		Set<String> keys = stuMap.keySet();
		System.out.println(keys);
		for(String key : keys) {
			System.out.println(stuMap.get(key));
			System.out.println("-------");
		}
		
		//entrySet 사용 for문
		Set<Entry<String, String>> entrySet = stuMap.entrySet();
		for(Entry<String, String> entry: entrySet) {
			String key = entry.getKey();
			String value =entry.getValue();
			System.out.println(key + ":" + value);
			System.out.println("-------");
		}
		
		//hash
		HashMap<String, Integer> coinMap = new HashMap<>();
		coinMap.put("비트코인", 142872834);
		coinMap.put("이더리움", 3458439);
		
		for(String coin: coinMap.keySet()) {		///for문을 사용한이유??
			System.out.println(coin + ":" + coinMap.get(coin));
		}
		
}

}
