package koreait12;
//작성자: 이재홍
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class C52_MyDictionary {

	public static void main(String[] args) {
//		HashMap<String, String> dic = new HashMap<>();
		TreeMap<String, String> dic = new TreeMap<String, String>();	//이진 검색 가능한 구조로Map을 생성 : 정렬이 되는 Map
		String eng,kor,sel;
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		System.out.println("1. 단어저장\t2. 단어검색\t3. 단어장보기\t4.프로그램 끝내기");
		while(run) {
			System.out.print("선택 ->");
			sel = sc.nextLine();	//sc.nextInt(); 일 때는 엔터값 가져오지 않고 숫자만 가져옴
			switch(sel) {
			case"1":
				System.out.print("English ->");
				eng = sc.nextLine();
				System.out.print("Korean ->");
				kor = sc.nextLine();
				dic.put(eng,kor);
				break;
			case"2":
				System.out.print("검색 단어 English -> ");
				eng = sc.nextLine();
				System.out.println("단어장 검색했습니다. 결과 => " + dic.get(eng));
				break;
			case"3":
				System.out.println("단어장 전체보기 : " + dic);
				break;
			case"4":
				run=false;
				break;
			default:
				System.out.println("잘못 입력된 선택입니다.");
				break;
			}
		}System.out.println(":::단어장 종료합니다:::");
		// 참고: 정수 데이터 입력을 받아야 한다면 문자열 nextLine() 받아서 정수로 변환합니다.
		//int score = Integer.parseInt(sc.nextLine());
		// 이유: nextInt()는 엔터를 처리하지 않아서 다음에 나오는 nextLine()에게 전달되어 입력 흐름에 방해가 됩니다.
		// 결론 : 한 소스파일에서 nextInt()만 사용 또는 nextLine()만 사용하거나 합니다.
		/*
		while(true) {
		System.out.print("선택 ->");
		int wri = sc.nextInt();
		sc.nextLine();
		if (wri==4) break;
		if (wri==1){
			System.out.print("English ->");
			eng = sc.nextLine();
			System.out.print("Korean ->");
			kor = sc.nextLine();
			dic.put(eng,kor);
		} else if (wri==2){
			System.out.print("검색 단어 English -> ");
			eng = sc.nextLine();
			System.out.println("단어장 검색했습니다. 결과 => " + dic.get(eng));
		} else if (wri==3) {
			System.out.println("단어장 전체보기 : " + dic);
		} 
		}
		*/
		sc.close();
		

	}

}
