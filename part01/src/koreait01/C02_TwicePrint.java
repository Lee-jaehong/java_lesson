package koreait01;

public class C02_TwicePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ʈ���̽�");
		System.out.println("�̸�\t�������\t\t����");
		System.out.println("----------------------------------------------");
		System.out.println("�糪\t1996.12.29\t27");
		System.out.println("��ȿ\t1997.02.01\t26");
		System.out.println("�̳�\t1998.03.24\t25");
		//printf() �޼ҵ� ����ؼ� ������� ����
		//12ĭ���ڿ�+�ڸ��� �������� ���� ���ڿ� + 5ĭ ����
		//%s�� ������ ĭ���� �����ʸ���, -��ȣ�� ���� ����
		System.out.printf("%-12s%s%5d\n", "dayeon", "1998.05.28", 25);
		System.out.printf("%-12s%s%5d\n", "momo", "1999.04.23", 24);
		System.out.printf("%-12s%s%5d\n", "nana", "1997.06.14", 27);
		//printf �޼ҵ忡�� ���Ĺ��� ������ŭ �ڿ� ������ ������ ������ ��ġ�ؾ� �մϴ�. 
		//System.out.printf("%-12s%s%5d\n", "nana", "1997.06.14");
		//printf �޼ҵ忡�� ���Ĺ��ڿ� �ڿ� ������ ������ ������ ��ġ���� �ʾ� �����߻� 
		//System.out.printf("%-12s%5d\n", "nana", "1997.06.14");
		
		//����:System.out.printf("%-12s%s%5d\n", "dayeon", "1998.05.28", 25);
		// �� ������� "1998.05.28"�� ��������(������)�� ����ϵ��� ����.
		System.out.println("/////////����//////////");
		System.out.printf("%-12s%4d.%02d.%2d%5d\n", "dayeon", 1998, 5, 28, 25);
		System.out.printf("%-12s%4d.%2d.%2d%5d\n", "dayeon", 1999, 11, 23, 25);
		System.out.printf("%-12s%4d.%02d.%02d%5d\n", "dayeon", 1998, 5, 3, 25);
		// ��������� �����͸� ���� ���ͷ�("momo", 1998, true...) �� ǥ���ؼ� ����߽��ϴ�.
		
		//�������� : ����(�����͸� �����ϰ� �ִ� ������ �̸�) ���
		//System.out.printf("%-12s%4d.%02d.%02d%5d\n", name, year, month, day, age);
	}
/*
 * ��¿� ���Ǵ� ����
 * 
 * \(��������) ����ϴ� �̽������� ����: \n(�ٹٲ�), \t(tap)
 * ������������ % ��ȣ ��� : %s(���ڿ�), %d(����) �ڸ����� �����ؼ� �� �� �ֽ��ϴ�.
 *                                �� ���� �ڸ� 0���� ä�ﶧ���� %03d�� ���� �մϴ�.
 * 
 */
}
