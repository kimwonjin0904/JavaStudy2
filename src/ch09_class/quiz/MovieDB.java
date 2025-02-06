package ch09_class.quiz;

import java.util.ArrayList;

public class MovieDB {
	
	private ArrayList<Movie> MovieList = new ArrayList<>();
	
	//private 생성자 >> 해당 클래스에서만 생성할수 있음
	//인스턴스를 1개만 만들게 하는 방법으로 최초에 한번만 메로리에 할당하여
	//메로리 낭비를 방지 할 수 있으며 단 하나의 객체로 존해해도 되는 클래스에 적용
//	//이와 같은 방법을 싱클톤 패턴이라 함.
	private void MovieDB() {
		MovieList.add(new Movie("신세게","거 죽기 딱 좋은 날씨네", "박성웅", "ㅅㅅㄱ"));
		MovieList.add(new Movie("기생충","너는 다 계획이 있구나", "송강호", "ㄱㅅㅊ"));
	}
	private static MovieDB instance = new MovieDB();
	
	public static MovieDB getInstance() {
		return instance;
	}
	public ArrayList<Movie> getMovieList(){
		return MovieList;
	}
}
