package ch09_class.typing;

import java.util.ArrayList;

public class Dictionary {

	//전역적으로 사용하는 상수
	public static final int OPTION_STUDENT = 0; 	//상수는 보통 대문자로 final=상수, static= 외부에서 사용가능
	public static final int OPTION_CODING_WORD =1;
	public static final int OPTION_RANDOM =2;
	
	//타자연습 게임을 위한 단어메소드
	public static ArrayList<String> makeWordList(int option){
		ArrayList<String> result = new ArrayList<>();
		if(option == OPTION_STUDENT) {
			result.add("kang jisuk");
			result.add("kim dorae");
		}else if(option == OPTION_CODING_WORD ) {
			result.add("class");
			result.add("if");
		}else if(option == OPTION_RANDOM) {
			//랜덤 알파벳 6자리로 단어 생성
			//10개 
			String [] alphabet = "qwertuoiwejro".split("");
			//10개 담기
			for(int i=0; i<10; i++) {
				String word ="";
				for(int j=0; i<6; j++) {
					int idx = (int)(Math.random()* alphabet.length);
					word += alphabet[idx];
				}
				result.add(word);
			}
		}
		return result;
	}
}
