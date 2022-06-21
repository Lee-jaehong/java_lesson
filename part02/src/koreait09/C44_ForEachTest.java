package koreait09;

public class C44_ForEachTest {

	public static void main(String[] args) {
// 배열을 for문에서 접근할 때 인덱스 변수를 사용합니다. 코딩할때 효율성을 높이기 위해 향상된 for(for each) 사용
		
		int[] itest = {1,2,3,4,5,6};
		String [] stest = {"break", "public", "each", "package", "while"};
		
		// 배열을 for문에서 접근할 때 인덱스 변수를 사용합니다.
		for (int i=0;i<itest.length;i++)
			System.out.println("i= " + i + ", itest[i] = " +itest[i]);
		// itest[i]는 int 타입

		for (int i=0;i<stest.length;i++)
			System.out.println("i= " + i + ", stest[i] = " +stest[i]);
		// stest[i]는 String 타입
		
		// temp 변수 사용
		for (int i=0;i<itest.length;i++) {
			int temp = itest[i];
			System.out.println("i= " + i + ", itest[i] = " +temp);
		}
		
		// 코딩할때 효율성을 높이기 위해 향상된for(for each) 사용 : 단 itest[i]만 사용할때
		System.out.println("itest 배열값");
		for(int temp : itest)  // 배열에 저장된 값만 순서대로 꺼내서 temp 변수에 저장
			System.out.println(temp);
		System.out.println("\nstest 배열값");
		for(String temp : stest)
			System.out.println(temp);
	}

}
