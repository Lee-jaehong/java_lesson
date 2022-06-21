package koreait17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C70_StringSplit {

	public static void main(String[] args) {
		
		//String 클래스의 split(분열) 메소드
		
		String temp = "모모 90 88 79";
		String result[] = temp.split(" ");	// 공백을 기준으로 문자열을 여러개로 쪼개기
		System.out.println("1. 반복문 없이 출력");
		System.out.println("index 0 : " + result[0]);
		System.out.println("index 1 : " + result[1]);
		System.out.println("index 2 : " + result[2]);
		System.out.println("index 3 : " + result[3]);
		System.out.println("result length : " + result.length);
		
		// for문으로
		System.out.println("2. 일반적인 for문 출력");
		for(int i=0;i<result.length;i++)
			System.out.println(String.format("resutl[%d] : %s", i, result[i]));
		
		// 향상된 for
		System.out.println("3. 향상된 for문 출력");
		for(String t : result)
			System.out.println("result 요소 : " + t);
		
		String temp2 = "모모,90,88,79";
		result = temp2.split(",");
		
		System.out.println("4. split 구분기호 ,");
		for(String t : result)
			System.out.println("result 요소 : " + t);
		
		temp2 = "모모,,90,,88,,79";
		result = temp2.split(",");
		System.out.println("5. split 구분기호 ,");
		System.out.println("result length : " + result.length);
		for(String t : result)
			System.out.println("result 요소 : " + t);
		//result[1],result[3],result[5] 3개의 빈 문자열 입니다.
		
		result = temp2.split(",,");
		System.out.println("6. split 구분기호 ,,");
		System.out.println("result length : " + result.length);
		for(String t : result)
			System.out.println("result 요소 : " + t);
		
		//split의 인자인 문자열은 정규식 문자열입니다.(정규식 패턴은 복잡. 어렵습니다.)
		//	정규식 예시 : [] 안에 표시하는 것은 문자여러개가 또는(or) 에 해당됩니다.
		temp2 = "모모,90 88()79";
		result = temp2.split("[ ,()]");
		System.out.println("7. split 구분기호 ,,");		// 정규식 문자열: 구분기호는 공백 또는 ,또는 ( 또는)
		System.out.println("result length : " + result.length);
		for(String t : result)
			System.out.println("result 요소 : " + t);
		
		temp2 = "모모,90,88,79";
		result = temp2.split(",", 2);
		//result = temp2.split(",", 6);
		System.out.println("8. split 두번째 인자 limit 확인");
		// limit은 리턴되는 배열의 크기. 단 쪼개지는 갯수보다 커질수는 없음
		System.out.println("result length : " + result.length);
		for(String t : result)
			System.out.println("result 요소 : " + t);
		
		//배열과 유사한 자료구조 : List
		//배열을 List로 변환하는 방법
		result = temp2.split(",");
		System.out.println("9. result 배열을 List 객체로 변경");
		List<String> rlist = Arrays.asList(result);
		System.out.println(rlist);
		System.out.println("rlist size : " + rlist.size());
		for(String t:rlist)
			System.out.println("rlist 요소 : " + t);
		
		//위의 rlist는 배열의 크기만큼 List의 크기를 정적으로 생성합니다.(추가/삭제/변경 못함)
		//rlist.add("test");		//오류 : 고정된 크기의 리스트
		//rlist.remove(2);			//오류
		//rlist.add(2,"100");
		// 동적인 List로 만들기
		List<String> rlist2 =  new ArrayList<String>(rlist);
		System.out.println(rlist2);
		rlist2.add("test");
		rlist2.remove(2);
		rlist2.add(2, "100");
		System.out.println(rlist2);
		
		//Arrays.asList 는 테스트용으로 또는 간단한 사용할 리스트 만들 때 유용합니다.
		List<Integer> ilist = Arrays.asList(1,2,6,9,100);
		System.out.println("11. Arrays.asList 활용");
		System.out.println(ilist);
		

	}

}
