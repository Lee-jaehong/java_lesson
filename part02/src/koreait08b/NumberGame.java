package koreait08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int max = 10; // 시도회수
		int[] triallst = new int[max];
		
		
		System.out.println("숫자 맞추기 게임 시작합니다. 나 컴퓨터는 수자를 결정했습니다.");
		System.out.println("너, 휴먼은 맞춰보세요. (101 ~ 299)");
		int numComputer = r.nextInt(199)+101; // 컴퓨터가 선택한 랜덤한 값 범위 101~299
		int numHuman; // 내가 입력해서 선택할 값
		int i = 0;
		
		do {
			System.out.print("생각한 숫자 입력(기회 : " + (max-i) + ") -> "); // 남은 기회수 표시
			numHuman = sc.nextInt();
			if (numComputer > numHuman) {
				triallst[i] = numHuman;
				i++;
				System.out.println("아닙니다. 더 큰 값입니다.");
			} else if (numComputer < numHuman) {
				triallst[i] = numHuman;
				i++;
				System.out.println("아닙니다. 더 작은 값입니다.");
			}
			if (i==max) break; // max번 되면 선택 불가
		} while (numComputer != numHuman); // 두값이 맞을때까지 반복
		
		if (i==max) {
			System.out.println("너 휴먼 입력 내용 : " + Arrays.toString(triallst));
			System.out.println("주어진 기회를 다 쓰셨습니다. 게임을 다시 시작하세요.!!");
		} else {
			System.out.println("딩동댕~ 맞추셨습니다. 성공까지 시도횟수 : " + (i+1));
		}
		sc.close();

	}

}
