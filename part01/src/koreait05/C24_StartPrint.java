package koreait05;

import java.util.Scanner;

public class C24_StartPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count;
		System.out.println("[[영화감상 후기]]");
		System.out.println("평점을 몇 점 주시겠습니까? -> ");
		count = sc.nextInt();
		
		System.out.println("방법1");
		for (int i=0;i<count;i++)
			System.out.print("★");
		System.out.println("\n방법2");
		for (int i=0;i<count;i++)
			System.out.print("★");
		for (int i=0;i<5-count;i++)
			System.out.println("☆");
		
		System.out.println("\n방법3");
		for (int i=0;i<5;i++)
			if (i<count)
				System.out.println("★");
			else
				System.out.println("☆");
		
		System.out.println("\n방법4");
		int k=0;
		for(k=0;k<count;k++)
			System.out.println("★");
		
		for (;k<5;k++)
			System.out.println("☆");
		
		

	}

}
