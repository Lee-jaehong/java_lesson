package koreait05;
// ����ȫ

import java.util.Scanner;

public class C28_IntArrayEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] nums = new int [5];
		int num, sum = 0;
		double avr;
		for (int i = 0;i<nums.length;i++) {
		System.out.print("�迭����� ���� �Է��ϼ��� -> ");
		num = sc.nextInt();
		nums[i] = num;
		sum += nums[i];
		}
		int max = maxOfArray(nums), min = minOfArray(nums);
		avr = (double)(sum) / nums.length;
		System.out.println("�հ� :" + sum);
		System.out.println("��� :" + avr);
		System.out.println("�ִ밪 :" + max);
		System.out.println("�ּҰ� :" + min);
		
		/* 1. int �迭ũ�� 5�� �����ϼ��� �̸��� nums
		 * 2. �迭 ����� ���� ����� �Է����� �����մϴ�.
		 * 3. �Էµ� ���� �հ�, ����� ���մϴ�.
		 * 4. �Էµ� ���� �ִ밪, �ּҰ��� ���ϴ� �޼ҵ带 ����ϴ�.
		 *              �� maxOfArray, minOfArray : ���ڴ� int, ��ȯ������ int
		 */

	}
	public static int maxOfArray(int[] nums) {
		int max = nums[0];
		for (int i = 0;i<nums.length;i++) {
		if (max < nums[i])
			max = nums[i];
		} // for end
		return max;
	} 
	public static int minOfArray(int[] nums) {
		int min = nums[0];
		for (int i = 0;i<nums.length;i++) {
		if (min > nums[i])
			min = nums[i];
		} // for end
		return min;
	} 

	// max,min ������ ����  �迭�� 0�� ��Ұ����� �ʱ�ȭ �մϴ�.
	// �迭��� 1������ ��������ұ��� max,min�� ������� ���ؼ� 
	// max�� �װ����� ������(min�� �װ����� ũ��) max(min) ���� �迭��Ұ����� �����մϴ�.
	// -> �񱳰� ������ ���� max,min ������ �˴ϴ�.
}
