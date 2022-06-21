package koreait12;

import java.util.ArrayList;
import java.util.Random;

public class C49_LottoTest {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		Random r = new Random();
		
		for (int i=0;i<45;i++)
			numbers.add(i+1);
		System.out.println("numbers");
		System.out.println(numbers);
		
		ArrayList<Integer> lotto = new ArrayList<>();
		int k;
		for(int cnt=0;cnt<6;cnt++) {
			k=r.nextInt(45-cnt);
		System.out.println("k="+k+", number =" + numbers.get(k));
		lotto.add(numbers.get(k));
		numbers.remove(k);
		System.out.println("남은공");
		System.out.println(numbers);
		}
		System.out.println("최종선택숫자 6개");
		System.out.println(lotto);
	}
// 배열은 저장된 값의 위치 변경(삽입/삭제) 메소드가 없습니다. 배열은 한 번 크기는 정적입니다.
// -> 이런 부분을 ArrayList가 해결하고 웹프로그래밍 할때 ArrayList가 필수
}
