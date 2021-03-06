package koreait13a;

import koreait13.InterfaceA;
import koreait13.InterfaceB;

public class C56_Anonymous {
	public static void main(String[] args) {
		InterfaceA ia = new InterfaceA() {
			
			@Override
			public int methodB(int num) {
				System.out.println(" i am anonymous.!!");
				return 1234;
			}
			
			@Override
			public void methodA() {
				System.out.println("익명 InterfaceA methodA");
				
			}
		};
		InterfaceB ib = new InterfaceB() {
			
			@Override
			public String name(String name) {
				
				return "익명 내부 클래스 : " + name;
			}
		};
		ia.methodA();
		ia.methodD("하이 ~ 인터페이스");
		InterfaceA.methodC();
		System.out.println("상수 : " + InterfaceA.SIZE);
		
		System.out.println(ib.name("테스트"));
			
		
	}
}
