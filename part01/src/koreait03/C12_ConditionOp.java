package koreait03;

import java.util.Scanner;

public class C12_ConditionOp {
// 조건식의 결과에 따라 명령을 선택하는 조건연산자 : 조건식? 값 /수식T : 값/수식 F
	public static void main(String[] args) {
		int korean, math; // 국어점수, 수학점수
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수입력 -> ");
		korean = sc.nextInt();
		
		System.out.print("수학점수입력 -> ");
		math = sc.nextInt();
				
		// 국어점수와 수학점수 모두 80 점 이상인가? -> 모범학생
		System.out.println("모범학생 ? " + ((korean >=  80 && math >= 80)? "맞습니다.":"아닙니다."));
		
		// 처리할 명령을 제어하는 조건문
		//     { } 는 명령문 블록(block) 이고 여러개의 명령들을 감싸는 역할의 기호,
		
		if (korean >=  80 && math >= 80) {    // 조건식이 참일때 실행하는 명령들
			System.out.println("맞습니다.");
		} else {     // 조건식이 거짓일때 실행하는 명령들
			System.out.println("아닙니다.");
		}
        //      { } 안에 들어가는 명령이 1개일 때는 생략할 수 있습니다.
		if (korean >=  90 || math >= 90)
			System.out.println("맞습니다.");
		else
			System.out.println("아닙니다.");
		// else { }에 해당하는 내용이 없으면 작성 안합니다.
		if (!(korean >= 20 && korean <= 80 ))
			System.out.println("표준편차값이 큰 점수입니다.");
		
		

	}

}
