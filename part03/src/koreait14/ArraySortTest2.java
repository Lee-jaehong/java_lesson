package koreait14;

import java.util.Arrays;
// �ۼ���:����ȫ
public class ArraySortTest2 {
	// �迭�� ����� �� �����ϱ� ���� �����ϼ���
	public static void main(String[] args) {
		String [] i1 = {"����","����","����","�ź�","����","���"};
		
		System.out.println("���� i1 �迭 : " + Arrays.toString(i1));
		asecending(i1);
		System.out.println("�������� : " + Arrays.toString(i1));
		descending(i1);
		System.out.println("�������� : " + Arrays.toString(i1));
	}
	static void asecending(String names[]) {
		String temp;
		for(int i=0;i<names.length-1;i++) {
			for(int k=i+1;k<names.length;k++) {
				if(names[i].compareTo(names[k])>0) {
					temp=names[i];
					names[i]=names[k];
					names[k]=temp;
				}
			}
		}
	}
	static public void descending(String names[]) {
		String temp;
		for(int i=0;i<names.length-1;i++) {
			for(int k=i+1;k<names.length;k++) {
				if(names[i].compareTo(names[k])<0) {
					temp=names[i];
					names[i]=names[k];
					names[k]=temp;
				}
			}
		}
	}
}
