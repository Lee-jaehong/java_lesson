package koreait05;
// 이재홍

import java.util.Scanner;

public class C28_IntArrayEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] nums = new int [5];
		int num, sum = 0;
		double avr;
		for (int i = 0;i<nums.length;i++) {
		System.out.print("배열요소의 값을 입력하세요 -> ");
		num = sc.nextInt();
		nums[i] = num;
		sum += nums[i];
		}
		int max = maxOfArray(nums), min = minOfArray(nums);
		avr = (double)(sum) / nums.length;
		System.out.println("합계 :" + sum);
		System.out.println("평균 :" + avr);
		System.out.println("최대값 :" + max);
		System.out.println("최소값 :" + min);
		
		/* 1. int 배열크기 5를 선언하세요 이름은 nums
		 * 2. 배열 요소의 값은 사용자 입력으로 저장합니다.
		 * 3. 입력된 값의 합계, 평균을 구합니다.
		 * 4. 입력된 값의 최대값, 최소값을 구하는 메소드를 만듭니다.
		 *              ㄴ maxOfArray, minOfArray : 인자는 int, 반환값형식 int
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

	// max,min 변수를 각각  배열의 0번 요소값으로 초기화 합니다.
	// 배열요소 1번부터 마지막요소까지 max,min과 순서대로 비교해서 
	// max가 그값보다 작으면(min이 그값보다 크면) max(min) 값을 배열요소값으로 변경합니다.
	// -> 비교가 끝나면 최종 max,min 결정이 됩니다.
}
