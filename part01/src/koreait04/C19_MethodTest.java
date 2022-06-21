package koreait04;

public class C19_MethodTest {

    // main 메소드 : 실행의 시작점. 프로그램 실행을 위해서는 꼭 있어야 할 메소드. static	
	public static void main(String[] args) {
		System.out.println("메소드를 직접 정의해서 사용해봅니다.");
		System.out.println("프로그램은 main 메소드의 명령문을 순서대로 실행하고 중간에 메소드 호출을 만나면 메소드가 정의된 실행을 위해");
		System.out.println("제어를 이동합니다. 메소드 실행이 종료되면 다시 main 메소드로 제어가 돌아옵니다.");
		methodA();  // 메소드 호출(실행). 필요할 때 호출합니다.
		System.out.println("2.");
		methodB(11, 33); // 11,33은 메소드 실행에 필요한 인자
		methodB(929,111);
//      methodB(929,12.1); // 오류: 매개변수 형식 오류
		System.out.println("3.");
		methodC(929, 12.1);
		methodC(929, 121); // 오류 아님 : 자동캐스팅(형변환)
		System.out.println("4.");
		System.out.println("return = " + methodD()); // 반환값을 받아서 출력하는 예시.
		int temp = methodD();  // 반환값을 받아서 변수에 저장하는 예시
		System.out.println("return = " + temp);
		System.out.println("5.");
		System.out.println("return = " + methodE(12, 13.8));
		System.out.println("6.");
		System.out.println(methodf('i', 4));
		
		char ch = 'a';
		int val = 3;
		ch = methodf(ch, val);
		System.out.println("return = " + ch);
		
		
	}
	// static 인 main에서 실행할 메소드는 동일하게 static이어야 합니다.
	// 메소드 선언(정의)
	public static void methodA() {
		System.out.println("##첫번째 메소드 정의 연습입니다.##");
		
	 }
	public static void methodB(int a, int b) { // int a, int b는 인자값을 전달받는 매개변수
		System.out.println("##두번째 메소드 정의 연습입니다.");
		System.out.println("전달받은 값 a = " + a + " b = "+ b);
	}
	public static void methodC(int a, double b) { 
		System.out.println("##세번째 메소드 정의 연습입니다.");
		System.out.println("전달받은 값 a = " + a + " b = "+ b);
	}
	public static int methodD() {   // 반환값이 있는 형식 : 반환값은 int 데이터, 반드시 return이 필요합니다.
		System.out.println("##네번째 메소드 정의 연습입니다.##");
		return 999;
	}
		public static double methodE(int a, double b) {
		System.out.println("##다섯번째 메소드 정의 연습입니다.##");
		return a+b;   // 인자로 전달받은 값으로 실행하고 처리결과 리턴
	}
		public static char methodf(char a, int b) {
		System.out.println("##여섯번째 메소드 정의연습입니다.");
		return (char)(a+b);
		}

		
	}

/*
 * String 클래스의 메소드를 이해하기 위해서, 먼저
 * ㄴ 메소드의 구조연습
 * 
 * 메소드의 주요 요소 : 반환값(형식), 인자(argument) 또는 매개변수(parameter), 메소드 이름, public 또는 static 등의 설정
 *    ㄴ 반환값 : 메소드 실행 완료되면 얻어지는 결과 값
 *    ㄴ 인자 : 메소드 실행을 위해서 필요한 데이터 (형식과 변수명 선언 필요) - 인자의 갯수와 형식은 다양합니다.
 *    ㄴ 메소드 이름 : 식별자 
 *    ㄴ public : 접근한정자, static : 정적 요소
 * 
 * 
 */

