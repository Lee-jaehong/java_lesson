package koreait08;

import java.util.Scanner;

public class MyClass2Test {
// �ϰ� ���� ������ �غ�����. - MyClass2 ��ü ����
	public static void main(String[] args) {
		MyClass2 my2 = new MyClass2();
		// Ŀ���� �����ڸ� �����ϸ� �⺻���� �� �� �ִ� �⺻�����ڰ� 
		// ����� �� ���� �˴ϴ�. -> ���� �����մϴ�.
		MyClass2 my22 = new MyClass2("����ȫ");
		my2.setAge(27);
		my22.setAge(22);
		
		System.out.println("my2 name : " + my2.getName());
		System.out.println("my22 name : " + my22.getName());
		// my2 ��ü�� �⺻�����ڸ� ����ϸ�  name �ʵ尪 �ʱ�ȭ�� ���մϴ�.(��������)
		// �⺻�����ڸ� ������� �ʴ� ����
//		Scanner sc = new Scanner();
		System.out.println("my2 age : " + my2.getAge());
		System.out.println("my22 age : " + my22.getAge());
		

	}

}
