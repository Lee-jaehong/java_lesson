package koreait14;

import java.util.Arrays;
// 작성자:이재홍
public class ArraySortTest2 {
	// 배열에 저장된 값 정렬하기 직접 구현하세요
	public static void main(String[] args) {
		String [] i1 = {"제니","다현","나연","신비","은하","모모"};
		
		System.out.println("원래 i1 배열 : " + Arrays.toString(i1));
		asecending(i1);
		System.out.println("오름차순 : " + Arrays.toString(i1));
		descending(i1);
		System.out.println("내림차순 : " + Arrays.toString(i1));
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
