package koreait14;

import java.util.Arrays;
// �ۼ���:����ȫ
public class ArraySortTest {
	// �迭�� ����� �� �����ϱ� ���� �����ϼ���
	public static void main(String[] args) {
		int [] i1 = new int[6];
		i1[0]=34;
		i1[1]=77;
		i1[2]=19;
		i1[3]=56;
		i1[4]=45;
		i1[5]=9;
		System.out.println("���� i1 �迭 : " + Arrays.toString(i1));
		asecending(i1);
		System.out.println("�������� : " + Arrays.toString(i1));
		descending(i1);
		System.out.println("�������� : " + Arrays.toString(i1));
	}
	static void asecending(int num[]) {
		int temp=0;
		for(int i=0;i<num.length-1;i++) {
			for(int k=i+1;k<num.length;k++) {
				if(num[i]>num[k]) {
					temp=num[i];
					num[i]=num[k];
					num[k]=temp;
				}
			}
		}
	}
	static public void descending(int num[]) {
		int temp=0;
		for(int i=0;i<num.length-1;i++) {
			for(int k=i+1;k<num.length;k++) {
				if(num[i]<num[k]) {
					temp=num[i];
					num[i]=num[k];
					num[k]=temp;
				}
			}
		}
	}
}
