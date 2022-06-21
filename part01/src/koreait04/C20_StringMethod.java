package koreait04;

public class C20_StringMethod {

	public static void main(String[] args) {
		String message = "hello~";   // java.lang.String (기본패키지 클래스)
		

		int len = message.length();
		char temp = message.charAt(3);  // 0부터 시작해서 3번 문자가 무엇인지 리턴.
		boolean isstate = message.contentEquals("Hello~");  // 문자열이 같은지 
		 
		System.out.println("length() = " + len);
		System.out.println("charAt(3) = " + temp);
		System.out.println("eqauls(\"Hello\") = " + isstate);
		
		System.out.println("message.indexOf('e')" + message.indexOf('e'));  //  1번위치
		System.out.println("message.indexOf(\"lo\")" + message.indexOf("lo")); // 3번위치
		System.out.println("message.indexOf(\"lo\")" + message.indexOf("ol")); // -1 : 찾는 문자열이 없을때
		String test = "hello~hello~";
		System.out.println("test.indexOf(\"lo\")" + test.indexOf("lo"));
		System.out.println("test.lastindexOf(\"lo\")" + test.lastIndexOf("lo"));
		System.out.println("message.substring(2)" + message.substring(2)); // 부분추출 : llo~
		System.out.println("message.substring(2, 4)" + message.substring(2, 4)); // ll, 2번부터 2개(4-2)
		System.out.println("message.replace(\"11\", \"*@\")" + message.replace("ll", "*@")); // 치환: he*@o~
		System.out.println("startsWith(\"H\")" + message.startsWith("H")); // false
		System.out.println("endsWith(\"~\")" + message.endsWith("~")); //true

	}
    // "를 출력할때는 \(역슬래쉬) 필요합니다. -> "기호는 문자열시작으로 해석되기 때문입니다.
}
//String 클래스의 메소드는 많습니다. 다 외우고 사용하는 것이 아니고 메소드의 이름, 인자, 리턴형식을 참조해서 사용합니다.

//message.length();  //public int length() : 길이
//message.charAt(0);  // public char charAt(int index)

//message.equals("Hello");  // public boolean equals(Object anObject) Object는 모든 타입
                          // message 가 String 타입이므로 Object는 String으로 해석합니다.

//리턴값 형식은?
/*		
message.indexOf('e');
message.indexOf("lo");
message.substring(2);
message.substring(2, 4);
message.replace("11", "*@");
*/		
//메소드 오버로딩(overloading) : 메소드 이름과 리턴형식은 같고 인자값의 갯수와 형식이 다르게 정의된 것.