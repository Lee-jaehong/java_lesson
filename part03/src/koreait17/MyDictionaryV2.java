package koreait17;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
//작성자: 이재홍
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

import koreait16.Word;

public class MyDictionaryV2 {

	private static Word wo2;
	private static Object Word;

	public static void main(String[] args) {


		List<Word> mywords = new ArrayList<>();	
		Scanner ssc=new Scanner(System.in);
		try {	
			System.out.print("파일에서 읽어올까요?(y or n) >>>");
			if(ssc.nextLine().equals("y"))
			//파일에서 기존 내용 읽어오고 그 내용을 mywords 리스트에 저장
			read(mywords, "C:\\class\\단어장.txt");
			else
				System.out.println("파일을 새로 만듭니다.");
		} catch (FileNotFoundException e1) {
			System.out.println("파일 읽는 중에 오류 발생하였습니다. - " + e1.getMessage());
		}	
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
		}try{
			System.out.print("파일에 저장 할까요?(y or n) >>>");
			if(ssc.nextLine().equals("y"))
			save(mywords, "C:\\class\\단어장.txt");
			else
				System.out.println("파일이 저장되지 않았습니다.");
		} catch(FileNotFoundException e) {
			System.out.println("파일 저장 중에 오류가 생겼습니다.-" + e.getMessage());
		} 
		System.out.println(":::단어장 종료합니다:::");
		
		sc.close();
		

	}

	private static void read(List<Word> mywords, String filename) throws FileNotFoundException {
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		StringTokenizer stk = null;
		while(sc.hasNext()) {
			String temp = sc.nextLine();		//파일에서 1줄 읽어온것 저장
			System.out.println(temp.substring(0, temp.indexOf("(")));
	//위의 결과를 참고로 StringTokenizer 로 Word 객체 만들고 mywords 리스트에 추가하기
			stk = new StringTokenizer(temp.substring(0, temp.indexOf("(")));
			while(stk.hasMoreElements()) {
				mywords.add(new Word(stk.nextToken(), stk.nextToken(),Integer.parseInt(stk.nextToken())));
			}
		}
		sc.close();
		System.out.println("파일 읽어오기 완료되었습니다.");
	}

	private static void save(List<Word> mywords, String filename) throws FileNotFoundException {
		File file =new File(filename);
		PrintWriter pw = new PrintWriter(file);
		for(Word w : mywords)
			pw.println(w);
		pw.close();
		System.out.println("파일 저장이 완료되었습니다.");
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
