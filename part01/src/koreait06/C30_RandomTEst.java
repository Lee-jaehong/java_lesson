package koreait06;

import java.util.Random;
// ���� �߻��ϴ� Random Ŭ������ �޼ҵ带 �׽�Ʈ �մϴ�.
public class C30_RandomTEst {

	public static void main(String[] args) {
		Random r = new Random(); // Random Ŭ������ ��ü ����(new����)
		
		System.out.println("1. ������ ������ 10�� ���");
		for (int i = 0;i<10;i++) {
			int inum = r.nextInt(); // int ���������� ������(����)�Դϴ�.
		    System.out.println(inum);
		}
		System.out.println("2. ������ ������ 10�� ��� - bound(��谪) ����.");
		for (int i = 0;i<10;i++) {
			int inum = r.nextInt(100); // 0<= ���� < 100 ������ ������ ����ϴ�.
		    System.out.println(inum);
		} //��谪�� ������� ����մϴ�.
		// 1<= ���� <101 ������ ������ ������ �Ѵٸ�?
		System.out.println("2. Ư�� ������ ������ 10�� ��� - bound�� �̿��� ����.");
		for (int i = 0;i<10;i++) {
			int inum = r.nextInt(100)+1; // 1<= ���� < 101 ������ ������ ����ϴ�.
		    System.out.println(inum);
		}
		
		// n���� ũ�ų� ���� m���� ���� ���� ���� : r.nextInt(m-n+1) + n
		
		System.out.println("4. 2~45 ������ ������ ���� 10��"); // n=2, m=46
		for(int i = 0;i<10;i++) {
			 int inum = r.nextInt(44)+2;
			 System.out.println(inum);
					 
		}
	}

}
