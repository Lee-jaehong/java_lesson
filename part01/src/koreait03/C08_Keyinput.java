package koreait03;

import java.util.Scanner;

// ���� : �ڹ� ���α׷��� ������ Ŭ���� �̸��� ���ϸ��� �����ϰ� �մϴ�.
public class C08_Keyinput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int width;
		
		int height;
		System.out.print("����, ���� �� �Է��ϼ���. -> ");
		width = sc.nextInt();  // ����ڰ� �Է��� ��
		height = sc.nextInt();
		int box_area = width * height;
		System.out.println("[[�簢�� ������ ���� ���ϱ�]]");
		System.out.printf("���� : %d cm \n", width);
		System.out.printf("���� : %d cm \n", height);
		System.out.printf("���̸� ���߽��ϴ�. -> %d �� \n", box_area);
		
		double half;
		System.out.print("�������� �Է��ϼ���. -> ");
		half = sc.nextDouble(); // ����ڰ� �Է��� ��
		double round = 2 * 3.14 * half; // �ѷ�
		double circle_area = 3.14 * half * half; // ����
		System.out.println("[[�� ������ ���̿� �ѷ� ���ϱ�]]");
		System.out.printf("������ : %.3f cm \n", half);
		System.out.printf("�ѷ��� ���߽��ϴ�. -> %.3f �� \n", round);
		System.out.printf("���̸� ���߽��ϴ�. -> %.3f �� \n", circle_area);
		
		// final �׽�Ʈ
		// �������� �տ� final(������) Ű���带 ���̸� ���� �������� ����
		final int test = 123;
		// test = 1; // ���� : final�� �����
		System.out.println(test);
		
		sc.close();  // Ű����(ǥ���Է���ġ) �ڿ� ��� ����
	}

}
