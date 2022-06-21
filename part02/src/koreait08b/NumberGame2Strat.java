package koreait08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame2Strat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 10; // �õ�ȸ��
		int[] triallst = new int[max];
		GameValue[] history = new GameValue[max]; // �ִ� max�� ����� �����ϱ�
		int k=0; // history �迭�� �ε��� ����
		System.out.println("���� ���߱� ���� �����մϴ�.");
		System.out.print("������ �����Ϸ��� �� �޸��� �̸��� ���ÿ� >>> ");
		String gamer = sc.nextLine();
		int rmin= 101, rmax=299;
		do {
			GameValue temp = new GameValue(gamer);
			System.out.println("���� ���߱� ���� �����մϴ�. �� ��ǻ�ʹ� ���ڸ� �����߽��ϴ�.");
			System.out.printf("��, �޸��� ���纸����. (%d ~ %d)\n", rmin, rmax);
			int numComputer = GameValue.makeNumber(rmin, rmax); // ��ǻ�Ͱ� ������ ������ �� ���� 101~299
			int numHuman; // ���� �Է��ؼ� ������ ��
			int i = 0;
			
			do {
					System.out.print("������ ���� �Է�(��ȸ : " + (max-i) + ") -> "); // ���� ��ȸ�� ǥ��
					numHuman = sc.nextInt();
					if (numComputer > numHuman) {
						triallst[i] = numHuman;
						i++;
						System.out.println("�ƴմϴ�. �� ū ���Դϴ�.");
					} else if (numComputer < numHuman) {
						triallst[i] = numHuman;
						i++;
						System.out.println("�ƴմϴ�. �� ���� ���Դϴ�.");
					}
					if (i==max) break; // max�� �Ǹ� ���� �Ұ�
				} while (numComputer != numHuman); // �ΰ��� ���������� �ݺ�
			    
				
				if (i==max) {
					System.out.println("�� �޸� �Է� ���� : " + Arrays.toString(triallst));
					System.out.println("�־��� ��ȸ�� �� ���̽��ϴ�. ������ �ٽ� �����ϼ���.!!");
					temp.setCount(max);
				} else {
					System.out.println("������~ ���߼̽��ϴ�. �������� �õ�Ƚ�� : " + (i+1));
					temp.setCount(i+1);
					temp.setSuccess(true);
				}
				history[k] = temp;
				k++; // ���� �ε�����, ī��Ʈ ����
				System.out.print("������ ����Ͻðڽ��ϱ�? ����Ϸ��� 0 �Է�(���ڸ� �Է��ϼ���) >>> ");
				// ������� �ݺ�
		} while (sc.nextInt()==0);
		
		System.out.println(":::::::::::::���ӽ��ھ�:::::::::::::");
		for (int x=0;x<k;x++) 
			history[x].print();  // history[x]�� Ÿ���� GameValue
		System.out.println(":::::::::::::The End:::::::::::::");
		
				sc.close();

	}

}

