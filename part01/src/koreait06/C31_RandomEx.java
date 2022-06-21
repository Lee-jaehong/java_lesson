package koreait06;

import java.util.Random;

public class C31_RandomEx {

	public static void main(String[] args) {
		Random r = new Random();
		/*
		 * �л� ����(����) ���� ������ ����ϴ�.
		 * �л� �ο��� 100�� - ������ ����(0<=����<=100
		 * 
		 * 90 ~ 100 : �� (�Ҽ��� 1�ڸ�%) ī��Ʈ������ 5�� �ʿ��մϴ�.(cntA, cntB...)
		 * 80 ~ 89 : �� (�Ҽ��� 1�ڸ�%)                           �� counts[5] : counts[0],counts[1]...
		 * 70 ~ 79 : �� (�Ҽ��� 1�ڸ�%)
		 * 60 ~ 69 : �� (�Ҽ��� 1�ڸ�%)
		 * 60�� �̸� : �� (�Ҽ��� 1�ڸ�%)
		 */
	
		int [] koreans = new int[100];
		int [] counts = new int[5];
		
		System.out.println("90~100\t 80~89\t 70~79\t 60~69\t 60�̸�");
		System.out.println("-------------------------------------------");
		for(int i = 0;i<koreans.length;i++) {
			koreans[i] = r.nextInt(101);	
			if (koreans[i]< 60) counts[4]++;
			else if (koreans[i] < 70) counts[3]++;
			else if (koreans[i] < 80) counts[2]++;
			else if (koreans[i] < 90) counts[1]++;
			else counts[0]++;
		} // ���� ���� ����, ���� ���� ���
		for (int i = 0;i<counts.length;i++)
			System.out.printf("%2d\t", counts[i]);
		System.out.println();
		for (int i = 0;i<counts.length;i++)
			System.out.printf("%.1f%%\t", (double)counts[i]/koreans.length*100);
	}

}
// �迭���� ����� ���(�����ͻ���, �߰�)�Ȱ��� ArrayList
// �迭������ ���� ������ �߰�/������ �����մϴ�. -> �޼ҵ� ����
