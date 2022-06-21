package koreait04;

import java.util.Scanner;

public class C18_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String best;
		float korean, english, science, total, avr, max;
		System.out.println("[[성적 집계 : 평균과 총점 구하기]]");
		
		System.out.println("성적 입력하세요.");
		System.out.print("국어 ->");
		korean = sc.nextInt();
		System.out.print("영어 ->");
		english = sc.nextInt();
		System.out.print("과학->");
		science = sc.nextInt();
		System.out.println("\n>>처리되었습니다.");
		total = korean + english + science;
		avr = (korean + english + science) / 3;
		System.out.println("총점 : " + (int)total);
		System.out.printf("평균 : %d (%.2f) , 과목수 : 3 \n", (int)avr, avr);
		if (korean > english) {
			max = korean;
			best = "국어";
		}else {
			max = english;
			best = "영어";
		}
		if (max < science) {
			max = science;
			best = "과학";
		}
		System.out.printf("이 학생의 특기 과목은 %s (%d점) 입니다.", best, (int)max);
		sc.close();
		
		
		

	}

}
