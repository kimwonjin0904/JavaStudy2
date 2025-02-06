package ch07_array;
//마지막 코드 보기 p170
/**
 * class Name	: AttayMain
 * Author		: SSAM
 * Created Date : 2025. 2. 3.
 * versopm	    : 1.0
 * Purpose		:[목적을 작성하세요]
 * Description  :array 배열 선언 및 사용법
 */
public class AttayMain {

	public static void main(String[] args) {
		String samjang = "삼장";
		String ogong = "오공";
		String saogeong = "사오정";
		String palgye = "저팔계";
		//배열(array)
		//String[]문자열 배열
		String [] seoyugi = new String[4]; // 첨자는 배열의 크기
		System.out.println(seoyugi.length);// 배열의 길이 리턴
		System.out.println(seoyugi.clone()[0]);// null은 값이 없음을 뜻함
		System.out.println(seoyugi);			
		
		seoyugi[0] = samjang;
		seoyugi[1] = ogong;
		seoyugi[2] = saogeong;
		seoyugi[3] = palgye;
		System.out.println(seoyugi);	
		printArr(seoyugi);
		
		int[]numbers = new int[3];
		System.out.println(numbers[0]);  //default 0, String null
		boolean [] bools = new boolean[5];  //default false
		System.out.println(bools[0]);		///???boolean 다시 보기
		
		//배열 수정	배열은 반복 작업을 위해서
		for(int i=0; i<seoyugi.length; i++) {		///다시 보기
			seoyugi[i] = "서유기" + seoyugi[i];
		}
		printArr(seoyugi);
		
		
		//오공이 포함되어 있는 배열의 요소를 찾아서 '서유기' -> 드래곤볼로 변경
		for(int i=0; i<seoyugi.length; i++) { 				///이 부분 다시보기 i??
			//포함문자열이 있으면 true 없으면 false리턴
			if(seoyugi[i].contains("오공")) {					///contains무슨역할
				//replace("찾는문자열", "변경문자열")
				//만약 변경하고자하는 동일 문자열이 많다면 reaplceAll
				seoyugi[i] =seoyugi[i].replace("서유기", "드래곤볼");		///서유기 뛰어쓰기??
			}
		}
		printArr(seoyugi); 			///이건 마지막에 써야되나??
		
		
		//값을 할당하며 배열선언
		String [] students = {"팽수","길동","동길","길수"}; 
		//아래와 동일함
	//	String [] students =  new String[]{"팽수","길동","동길","길수"};
		printArr(students);
		
		String subjects = "JAVA,DB, JS,HTML";			///여기서는 왜 {}이거를 안쓰는지??
		//','을 구분으로 배열에 담기
		//대상문자열.splie(구분자)
		String [] subArr = subjects.split(",");		
		printArr(subArr);
		//trim양쪽 공백제거
		for(int i=0; i<subArr.length; i++) {
			subArr[i] = subArr[i].trim();		//공백제거
		}
		printArr(subArr);
		//배열의 복사1.얇은 복사 shallow copy(주소값 복사)
		printArr(seoyugi);
		String[]singSeoyugi = seoyugi;//단순 할당은 주소가 복사됨
		printArr(singSeoyugi);
		singSeoyugi[0]="강호동";			//0번째를 강호동을 바꿈
		printArr(seoyugi);
		printArr(singSeoyugi);
		
		//배열의 복사2.깊은 복사(deep copy) 새로운 객체(주소가 다름)
		String[] newSeoyugi = seoyugi.clone();
		newSeoyugi[2] = "은지원";
		printArr(seoyugi);
		printArr(newSeoyugi);
		
		//clone 잊었을때
		//새로운 배열을 복사 대상 배열길이만큼으로 선언
		String[]copy=new String[seoyugi.length];
		for(int i=0; i<seoyugi.length; i++) {
			copy[i] = seoyugi[i];
		}
		
		//일차원 배열
		int[]oneD = {1,2,3};
		System.out.println(oneD[1]);
		//다차원 배열
		int [] []twoD = {{1,2,3}, {4,5,6},{7,8,9}};
		System.out.println(twoD[0][1]);
		int [][][] threeD = {{{1,2,3}, {4,5,6}}, {{7,8,9}, {10,11}}};
		System.out.println(threeD[0][0][1]);
		
		for(int i =0; i< twoD.length; i++) {
		for(int j=0; j<twoD[i].length; j++) {
			System.out.println(twoD[i][j]);
		}
	}		
		System.out.println("==3차원===");
		for(int i =0; i< threeD.length; i++) {
			for(int j=0; j<threeD[i].length; j++) {
				for(int x= 0; x<threeD[i][j].length; x++) {
					
				System.out.printf("i%d,j%d,x%d\n",i,j,x,threeD[i][j][x]);
				}
			}
		}		
	}
	
	//배열 출력
	public static void printArr(String[] arr) {   
		//삼장,오공,사오정,저팔계 옆으로 출력되게
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length - 1) {
				System.out.println(arr[i]);      ///???? print로 하면 0이 저팔계 옆으로감
				break;
			}
			System.out.print(arr[i]+",");
		}
	}
}
