package koreait12;
//�ۼ���: ����ȫ
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class C52_MyDictionary {

	public static void main(String[] args) {
//		HashMap<String, String> dic = new HashMap<>();
		TreeMap<String, String> dic = new TreeMap<String, String>();	//���� �˻� ������ ������Map�� ���� : ������ �Ǵ� Map
		String eng,kor,sel;
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		System.out.println("1. �ܾ�����\t2. �ܾ�˻�\t3. �ܾ��庸��\t4.���α׷� ������");
		while(run) {
			System.out.print("���� ->");
			sel = sc.nextLine();	//sc.nextInt(); �� ���� ���Ͱ� �������� �ʰ� ���ڸ� ������
			switch(sel) {
			case"1":
				System.out.print("English ->");
				eng = sc.nextLine();
				System.out.print("Korean ->");
				kor = sc.nextLine();
				dic.put(eng,kor);
				break;
			case"2":
				System.out.print("�˻� �ܾ� English -> ");
				eng = sc.nextLine();
				System.out.println("�ܾ��� �˻��߽��ϴ�. ��� => " + dic.get(eng));
				break;
			case"3":
				System.out.println("�ܾ��� ��ü���� : " + dic);
				break;
			case"4":
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

}
