package koreait04;

import java.util.Scanner;

public class C18_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String best;
		float korean, english, science, total, avr, max;
		System.out.println("[[���� ���� : ��հ� ���� ���ϱ�]]");
		
		System.out.println("���� �Է��ϼ���.");
		System.out.print("���� ->");
		korean = sc.nextInt();
		System.out.print("���� ->");
		english = sc.nextInt();
		System.out.print("����->");
		science = sc.nextInt();
		System.out.println("\n>>ó���Ǿ����ϴ�.");
		total = korean + english + science;
		avr = (korean + english + science) / 3;
		System.out.println("���� : " + (int)total);
		System.out.printf("��� : %d (%.2f) , ����� : 3 \n", (int)avr, avr);
		if (korean > english) {
			max = korean;
			best = "����";
		}else {
			max = english;
			best = "����";
		}
		if (max < science) {
			max = science;
			best = "����";
		}
		System.out.printf("�� �л��� Ư�� ������ %s (%d��) �Դϴ�.", best, (int)max);
		sc.close();
		
		
		

	}

}
