package koreait14;

import java.util.Arrays;
// 작성자:이재홍
public class ArraySortTest {
	// 배열에 저장된 값 정렬하기 직접 구현하세요
	public static void main(String[] args) {
		int [] i1 = new int[6];
		i1[0]=34;
		i1[1]=77;
		i1[2]=19;
		i1[3]=56;
		i1[4]=45;
		i1[5]=9;
		System.out.println("원래 i1 배열 : " + Arrays.toString(i1));
		asecending(i1);
		System.out.println("오름차순 : " + Arrays.toString(i1));
		descending(i1);
		System.out.println("내림차순 : " + Arrays.toString(i1));
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
