package koreait17;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
//�ۼ���: ����ȫ
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
			System.out.print("���Ͽ��� �о�ñ��?(y or n) >>>");
			if(ssc.nextLine().equals("y"))
			//���Ͽ��� ���� ���� �о���� �� ������ mywords ����Ʈ�� ����
			read(mywords, "C:\\class\\�ܾ���.txt");
			else
				System.out.println("������ ���� ����ϴ�.");
		} catch (FileNotFoundException e1) {
			System.out.println("���� �д� �߿� ���� �߻��Ͽ����ϴ�. - " + e1.getMessage());
		}	
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
		}try{
			System.out.print("���Ͽ� ���� �ұ��?(y or n) >>>");
			if(ssc.nextLine().equals("y"))
			save(mywords, "C:\\class\\�ܾ���.txt");
			else
				System.out.println("������ ������� �ʾҽ��ϴ�.");
		} catch(FileNotFoundException e) {
			System.out.println("���� ���� �߿� ������ ������ϴ�.-" + e.getMessage());
		} 
		System.out.println(":::�ܾ��� �����մϴ�:::");
		
		sc.close();
		

	}

	private static void read(List<Word> mywords, String filename) throws FileNotFoundException {
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		StringTokenizer stk = null;
		while(sc.hasNext()) {
			String temp = sc.nextLine();		//���Ͽ��� 1�� �о�°� ����
			System.out.println(temp.substring(0, temp.indexOf("(")));
	//���� ����� ����� StringTokenizer �� Word ��ü ����� mywords ����Ʈ�� �߰��ϱ�
			stk = new StringTokenizer(temp.substring(0, temp.indexOf("(")));
			while(stk.hasMoreElements()) {
				mywords.add(new Word(stk.nextToken(), stk.nextToken(),Integer.parseInt(stk.nextToken())));
			}
		}
		sc.close();
		System.out.println("���� �о���� �Ϸ�Ǿ����ϴ�.");
	}

	private static void save(List<Word> mywords, String filename) throws FileNotFoundException {
		File file =new File(filename);
		PrintWriter pw = new PrintWriter(file);
		for(Word w : mywords)
			pw.println(w);
		pw.close();
		System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");
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
