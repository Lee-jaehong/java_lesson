package koreait03;

import java.util.Scanner;

public class C10_keyinput {

	public static void main(String[] args) {
		// sc�� �������Դϴ�. �⺻�� ������ �ƴ� Ŭ���� Ÿ���� �����Դϴ�. -> ������ ����
		// �� new �������� ����� ��ü�� Ŭ���� �̸��� ���� �̸����� ���� �����մϴ�.
		Scanner sc = new Scanner(System.in);           // Ű���� �Է��� ���� ���� ����.
		
		int data;
		System.out.print("������ �Է��ϼ���. -> "); // �Է¾ȳ� �޼���
		data = sc.nextInt();  // ����ڷκ��� Ű���� �Է¹ް� �� ���� ������ ��ȯ�Ͽ� data ������ ����
		
		// ����ڰ� ���ڸ� �Է����� �ʾ������� ������ ��ȯ���� ���ϰ� ���� �߻���ŵ�ϴ�.
		
		System.out.println("�Էµ� ���� " + data + " �Դϴ�.");
		
		double point;
		System.out.print("�Ǽ��� �Է��ϼ���. -> ");
		
		point = sc.nextDouble();
		System.out.println("�Էµ� ���� " + point + " �Դϴ�.");
		
		sc.close();
	}

}

/*
 * 	ǥ�� ��� : System.out (out�� system Ŭ������ ������ �ʵ��̰� �޼ҵ� println()�� �����ϴ�.)
 *  ǥ�� �Է� : System.in     -> in�� system Ŭ������ ������ �ʵ�
 *                         -> Scanner Ŭ������ �̿��ؼ� �Է°��� Ư�� �⺻�������� ��ȯ���Ѵ� ��� ���.
 * 						   -> �⺻ ��Ű���� Ŭ������  �ƴϹǷ� import �� �ʿ��մϴ�.	
 *                      * ���� : �⺻��Ű�� java.lang�� import ���� ����մϴ�.
 *                      * ���� : import ����Ű�� ctrl + shift + O
 */
