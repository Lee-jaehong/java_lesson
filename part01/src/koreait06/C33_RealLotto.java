package koreait06;
// 작성자 : 이재홍
import java.util.Arrays;
import java.util.Random;

public class C33_RealLotto {

	public static void main(String[] args) {
		int[] numbers = new int[45]; 
		Random r = new Random();
		
		for (int i=0;i<45;i++) // 인덱스 범위 : 0~44
			numbers[i]=i+1; // 값 범위 : 1~45
		
		System.out.println("numbers 배열 초기화-------------------------");
		System.out.println(Arrays.toString(numbers));
		System.out.println("-----------------------------------------");
		
		int[] lotto = new int[6]; 
		int k; 
		for(int cnt=0;cnt<6;cnt++) {
			k=r.nextInt(45-cnt);// k는 처음엔 0<=k<45 -> 0<=k<44 -> ... 0<=k<40(***인덱스 범위***) 사이의 숫자 6번 뽑기
			                    // 삭제할 수록 뒤에 있는 인덱스 값은 중복이 나오니 for문 돌때마다 범위를 1씩 줄이기
			System.out.println("k="+k+", number =" + numbers[k]); // 랜덤하게 뽑힌 k와 numbers의 인덱스 k값 출력 6번 반복
			lotto[cnt]=numbers[k]; // lotto 인트형 배열의 뽑은 값을 저장
			
			for(int i=k;i<numbers.length-1;i++) {
				numbers[i]=numbers[i+1]; // 값을 하나씩 뽑을때마다 numbers에 저장된 값을 삭제하고 삭제한 값의 오른쪽에 있는 값을 
				                         // 한칸씩 가져오는 작업 (for문 안에 for문을 사용해 값을 뽑을때마다 반복)
			}System.out.println(Arrays.toString(numbers)); // numbers안에 값이 하나씩 삭제된 후 그 배열을 출력
		} 
		System.out.print("최종 선택 숫자 : ");
		System.out.println(Arrays.toString(lotto));
		
		Arrays.sort(lotto); // lotto 배열값의 크기 순서대로 위치를 변경합니다.
	    System.out.println(Arrays.toString(lotto)); // 오름차순으로 출력
		
		
			

	}

}
