package koreait07;

import java.util.Random;
import java.util.Scanner;

public class C42_Day07Exam {

	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		// String[] qus = new String[10];
		int[] total = new int[10];
		int count = 0;
		int[] odd = new int[10];
		int[] ran = new int[10];
		for (int i=0;i<10;i++)
			ran[i]=r.nextInt(90)+10;
		int[] ran2 = new int[10];
		for (int i=0;i<10;i++)
			ran2[i]=r.nextInt(90)+10;
		System.out.println("----------------------------------");
		System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
		System.out.println("----------------------------------");
		System.out.println("�����մϴ�.");
		
		
		for (int i=0;i<10;i++) {
			System.out.printf("���� %d.\t%d+ %d = �� �Է� -> ", i+1, ran[i], ran2[i]);
			total[i] = sc.nextInt();
			
			if (ran[i]+ran2[i]==total[i]) 
				count++;
			else
				// qus[i] = ("����" + (i+1) + ".\t" + ran[i] + "+ " + ran2[i] + " =\t" + "�� �Է� -> " + (ran[i]+ran2[i]));
				odd[i]=1;
		}
		System.out.println("----------------------------------");
		System.out.println("ä�� �մϴ�. ���� ���� " + count + "( " + count*10 + " ��)" );
		System.out.println("::::: Ʋ�� ���� ���� ���� :::::");
		for (int i=0;i<odd.length;i++) {
			if (odd[i] == 1)
			System.out.println("���� " + (i+1) + ".\t" + ran[i] + "+ " + ran2[i] + "=" + (ran[i]+ran2[i]));
		}
		sc.close();
		

	}

}
