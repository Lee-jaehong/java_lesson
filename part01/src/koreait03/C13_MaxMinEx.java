package koreait03;
// 이재홍
import java.util.Scanner;

public class C13_MaxMinEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3, max, min;
		System.out.print("n1의 값을 입력해주세요 -> ");
		n1 = sc.nextInt();
		System.out.print("n2의 값을 입력해주세요 -> ");
		n2 = sc.nextInt();
		System.out.print("n3의 값을 입력해주세요 -> ");
		n3 = sc.nextInt();
		
		if (n1 > n2) {
			max = n1; // max는 임시값
			min = n2;
		}
		else {
			max = n2; // max는 임시값
			min = n1;
		}
		
		if (n3 > max) 
			max = n3; // 임시 max값보다 n3이 더 클때만.
		
		if (min > n3)
			min = n3; // 임시 min값보다 n3이 더 작을 때만.
			
		
		System.out.println("max의 값 : " + max + " min의 값 : " + min);
		
		sc.close();

	}

}
