package koreait03;
// ����ȫ
import java.util.Scanner;

public class C13_MaxMinEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3, max, min;
		System.out.print("n1�� ���� �Է����ּ��� -> ");
		n1 = sc.nextInt();
		System.out.print("n2�� ���� �Է����ּ��� -> ");
		n2 = sc.nextInt();
		System.out.print("n3�� ���� �Է����ּ��� -> ");
		n3 = sc.nextInt();
		
		if (n1 > n2) {
			max = n1; // max�� �ӽð�
			min = n2;
		}
		else {
			max = n2; // max�� �ӽð�
			min = n1;
		}
		
		if (n3 > max) 
			max = n3; // �ӽ� max������ n3�� �� Ŭ����.
		
		if (min > n3)
			min = n3; // �ӽ� min������ n3�� �� ���� ����.
			
		
		System.out.println("max�� �� : " + max + " min�� �� : " + min);
		
		sc.close();

	}

}
