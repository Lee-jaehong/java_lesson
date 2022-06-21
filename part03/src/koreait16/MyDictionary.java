package koreait16;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
//�ۼ���: ����ȫ
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class MyDictionary {

	public static void main(String[] args) {

//		TreeMap<String, String> dic = new TreeMap<String, String>();	//���� �˻� ������ ������Map�� ���� : ������ �Ǵ� Map
		List<Word> mywords = new ArrayList<>();	// ***Treemap �� mywords�� �ٲ㼭 �����غ���***
		String eng,kor,sel;
		int level;
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		Word wo = new Word();
		
		System.out.println("1. �ܾ�����\t2. �ܾ�˻�\t3. �ܾ��庸��\t4.������ �˻�\t5.���α׷� ������");
		while(run) {
			System.out.print("���� ->");
			sel = sc.nextLine();	
			switch(sel) {
			case"1":
				System.out.print("English ->");
				eng = sc.nextLine();
				System.out.print("Korean ->");
				kor = sc.nextLine();
				System.out.print("���� -> ");
				level = Integer.parseInt(sc.nextLine());
				wo = new Word(eng, kor, level);
				mywords.add(wo);
				break;
			case"2":
				System.out.print("�˻� �ܾ� English ->");
				eng = sc.nextLine();
				for(int i=0;i<mywords.size();i++) {
					if (mywords.get(i).getEnglish().equals(eng))
						System.out.println("�ܾ��� �˻��߽��ϴ�. ��� => " + mywords.get(i).getKorean());
				}
				break;
			case"3":
				// System.out.println("�ܾ��� ��ü���� : " + mywords);
				all(mywords);	//�����ϰ� ����ϱ�
				break;
			case"4":
				System.out.print("�˻��� ���� �Է� (1~3) ->");
				int no = Integer.parseInt(sc.nextLine());
				level(mywords,no);
				
				break;
			case"5":
				run=false;
				break;
			default:
				System.out.println("�߸� �Էµ� �����Դϴ�.");
				break;
			}
		}System.out.println(":::�ܾ��� �����մϴ�:::");
		// ����: ���� ������ �Է��� �޾ƾ� �Ѵٸ� ���ڿ� nextLine() �޾Ƽ� ������ ��ȯ�մϴ�.
		//int score = Integer.parseInt(sc.nextLine());
		// ����: nextInt()�� ���͸� ó������ �ʾƼ� ������ ������ nextLine()���� ���޵Ǿ� �Է� �帧�� ���ذ� �˴ϴ�.
		// ��� : �� �ҽ����Ͽ��� nextInt()�� ��� �Ǵ� nextLine()�� ����ϰų� �մϴ�.
		/*
		while(true) {
		System.out.print("���� ->");
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
			System.out.print("�˻� �ܾ� English -> ");
			eng = sc.nextLine();
			System.out.println("�ܾ��� �˻��߽��ϴ�. ��� => " + dic.get(eng));
		} else if (wri==3) {
			System.out.println("�ܾ��� ��ü���� : " + dic);
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

	private static void all(List<Word> mywords) {	//my words�� ������ ���޹޾� ������ ��ü�� ����ŵ�ϴ�.
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
