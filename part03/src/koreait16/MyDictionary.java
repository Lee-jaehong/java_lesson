package koreait16;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
//작성자: 이재홍
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class MyDictionary {

	public static void main(String[] args) {

//		TreeMap<String, String> dic = new TreeMap<String, String>();	//이진 검색 가능한 구조로Map을 생성 : 정렬이 되는 Map
		List<Word> mywords = new ArrayList<>();	// ***Treemap 를 mywords로 바꿔서 구현해보기***
		String eng,kor,sel;
		int level;
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		Word wo = new Word();
		
		System.out.println("1. 단어저장\t2. 단어검색\t3. 단어장보기\t4.레벨로 검색\t5.프로그램 끝내기");
		while(run) {
			System.out.print("선택 ->");
			sel = sc.nextLine();	
			switch(sel) {
			case"1":
				System.out.print("English ->");
				eng = sc.nextLine();
				System.out.print("Korean ->");
				kor = sc.nextLine();
				System.out.print("레벨 -> ");
				level = Integer.parseInt(sc.nextLine());
				wo = new Word(eng, kor, level);
				mywords.add(wo);
				break;
			case"2":
				System.out.print("검색 단어 English ->");
				eng = sc.nextLine();
				for(int i=0;i<mywords.size();i++) {
					if (mywords.get(i).getEnglish().equals(eng))
						System.out.println("단어장 검색했습니다. 결과 => " + mywords.get(i).getKorean());
				}
				break;
			case"3":
				// System.out.println("단어장 전체보기 : " + mywords);
				all(mywords);	//정렬하고 출력하기
				break;
			case"4":
				System.out.print("검색할 레벨 입력 (1~3) ->");
				int no = Integer.parseInt(sc.nextLine());
				level(mywords,no);
				
				break;
			case"5":
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

	private static void level(List<Word> mywords, int no) {
		for (Word te:mywords) {
			if(te.getLevel()==no)
				System.out.println(te);
		}
			
		
	}

	private static void all(List<Word> mywords) {	//my words의 참조값 전달받아 동일한 객체를 가리킵니다.
		mywords.sort(new Comparator<Word>(){
			@Override
			public int compare(Word o1, Word o2) {
				return o1.getEnglish().compareTo(o2.getEnglish());
			}
		});
		System.out.println(String.format("%-20s %-20s %10s", "English","Korean","Level"));
		System.out.println("-----------------------------------------------------------");
		for(Word w:mywords)
			System.out.println(String.format("%-20s %-20s %10s", w.getEnglish(), w.getKorean(), w.getLevel()));
	}

}
