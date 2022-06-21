package koreait08;

import java.util.Scanner;

public class MyClass2Test {
// 하고 싶은 연습을 해보세요. - MyClass2 객체 생성
	public static void main(String[] args) {
		MyClass2 my2 = new MyClass2();
		// 커스텀 생성자를 정의하면 기본으로 쓸 수 있는 기본생성자가 
		// 사용할 수 없게 됩니다. -> 직접 정의합니다.
		MyClass2 my22 = new MyClass2("이재홍");
		my2.setAge(27);
		my22.setAge(22);
		
		System.out.println("my2 name : " + my2.getName());
		System.out.println("my22 name : " + my22.getName());
		// my2 객체에 기본생성자를 허용하면  name 필드값 초기화를 못합니다.(예시적용)
		// 기본생성자를 허용하지 않는 예시
//		Scanner sc = new Scanner();
		System.out.println("my2 age : " + my2.getAge());
		System.out.println("my22 age : " + my22.getAge());
		

	}

}
