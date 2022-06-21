package koreait03;

import java.util.Scanner;

// 참고 : 자바 프로그래밍 언어에서는 클래스 이름과 파일명이 동일하게 합니다.
public class C08_Keyinput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int width;
		
		int height;
		System.out.print("가로, 세로 값 입력하세요. -> ");
		width = sc.nextInt();  // 사용자가 입력할 값
		height = sc.nextInt();
		int box_area = width * height;
		System.out.println("[[사각형 도형의 넓이 구하기]]");
		System.out.printf("가로 : %d cm \n", width);
		System.out.printf("세로 : %d cm \n", height);
		System.out.printf("넓이를 구했습니다. -> %d ㎠ \n", box_area);
		
		double half;
		System.out.print("반지름값 입력하세요. -> ");
		half = sc.nextDouble(); // 사용자가 입력할 값
		double round = 2 * 3.14 * half; // 둘레
		double circle_area = 3.14 * half * half; // 넓이
		System.out.println("[[원 도형의 넓이와 둘레 구하기]]");
		System.out.printf("반지름 : %.3f cm \n", half);
		System.out.printf("둘레를 구했습니다. -> %.3f ㎠ \n", round);
		System.out.printf("넓이를 구했습니다. -> %.3f ㎠ \n", circle_area);
		
		// final 테스트
		// 변수선언 앞에 final(최종의) 키워드를 붙이면 값을 변경하지 못함
		final int test = 123;
		// test = 1; // 오류 : final로 선언됨
		System.out.println(test);
		
		sc.close();  // 키보드(표준입력장치) 자원 사용 해제
	}

}
