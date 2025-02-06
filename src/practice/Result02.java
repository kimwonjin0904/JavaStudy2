package practice;

import java.util.Scanner;

public class Result02 {

	public static void main(String[] args) {
		System.out.println("==난수 발생==");
		for(int i =0; i<10; i++) {
			System.out.println(math.random());
		}
		int randInt = (int) (math.random()*50+1);
		System.out.println(randInt);
		
		Scanner scan= new Scanner(System.in);
		int chance =5;
		while(true) {
			System.out.println("숫자를 입력:");
			int userPick =  Integer.parseInt((scan.nextLine()));
			System.out.println("정답입니다.");
			}
		chance--;
		if(chance ==0) {
			System.out.println("실패..정답은"+randInt +"입니다");
			break;
		}
		int userPick;
		if(userPick< randInt) {
			System.out.println("업"+chance+"남음");
		}else {
			System.out.println("다운"+chance+"남음");
		}
	}

}
