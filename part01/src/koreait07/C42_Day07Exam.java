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
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("----------------------------------");
		System.out.println("시작합니다.");
		
		
		for (int i=0;i<10;i++) {
			System.out.printf("문제 %d.\t%d+ %d = 답 입력 -> ", i+1, ran[i], ran2[i]);
			total[i] = sc.nextInt();
			
			if (ran[i]+ran2[i]==total[i]) 
				count++;
			else
				// qus[i] = ("문제" + (i+1) + ".\t" + ran[i] + "+ " + ran2[i] + " =\t" + "답 입력 -> " + (ran[i]+ran2[i]));
				odd[i]=1;
		}
		System.out.println("----------------------------------");
		System.out.println("채점 합니다. 맞은 갯수 " + count + "( " + count*10 + " 점)" );
		System.out.println("::::: 틀린 문제 정답 보기 :::::");
		for (int i=0;i<odd.length;i++) {
			if (odd[i] == 1)
			System.out.println("문제 " + (i+1) + ".\t" + ran[i] + "+ " + ran2[i] + "=" + (ran[i]+ran2[i]));
		}
		sc.close();
		

	}

}
