package koreait02;

// ���� : �ڹ� ���α׷��� ������ Ŭ���� �̸��� ���ϸ��� �����ϰ� �մϴ�.
public class C08_Test {

	public static void main(String[] args) {
		int width = 23;  // ����ڰ� �Է��� ��
		int height = 19;
		int box_area = width * height;
		System.out.println("[[�簢�� ������ ���� ���ϱ�]]");
		System.out.printf("���� : %d cm \n", width);
		System.out.printf("���� : %d cm \n", height);
		System.out.printf("���̸� ���߽��ϴ�. -> %d �� \n", box_area);
		
		double half = 23.23; // ����ڰ� �Է��� ��
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
		
	}

}
