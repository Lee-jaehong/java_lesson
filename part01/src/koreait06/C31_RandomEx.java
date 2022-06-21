package koreait06;

import java.util.Random;

public class C31_RandomEx {

	public static void main(String[] args) {
		Random r = new Random();
		/*
		 * 학생 성적(국어) 분포 보고서를 만듭니다.
		 * 학생 인원은 100명 - 점수는 랜덤(0<=난수<=100
		 * 
		 * 90 ~ 100 : 명 (소수점 1자리%) 카운트변수가 5개 필요합니다.(cntA, cntB...)
		 * 80 ~ 89 : 명 (소수점 1자리%)                           ㄴ counts[5] : counts[0],counts[1]...
		 * 70 ~ 79 : 명 (소수점 1자리%)
		 * 60 ~ 69 : 명 (소수점 1자리%)
		 * 60점 미만 : 명 (소수점 1자리%)
		 */
	
		int [] koreans = new int[100];
		int [] counts = new int[5];
		
		System.out.println("90~100\t 80~89\t 70~79\t 60~69\t 60미만");
		System.out.println("-------------------------------------------");
		for(int i = 0;i<koreans.length;i++) {
			koreans[i] = r.nextInt(101);	
			if (koreans[i]< 60) counts[4]++;
			else if (koreans[i] < 70) counts[3]++;
			else if (koreans[i] < 80) counts[2]++;
			else if (koreans[i] < 90) counts[1]++;
			else counts[0]++;
		} // 국어 점수 저장, 점수 분포 결과
		for (int i = 0;i<counts.length;i++)
			System.out.printf("%2d\t", counts[i]);
		System.out.println();
		for (int i = 0;i<counts.length;i++)
			System.out.printf("%.1f%%\t", (double)counts[i]/koreans.length*100);
	}

}
// 배열에서 기능이 향상(데이터삭제, 추가)된것이 ArrayList
// 배열에서는 직접 데이터 추가/삭제를 구현합니다. -> 메소드 정의
