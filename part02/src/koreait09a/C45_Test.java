package koreait09a;

import koreait09b.ClassAB;

public class C45_Test {

	public static void main(String[] args) {
		ClassAA test1 =  new ClassAA();
		test1.ab = 123;     // test1�� �����ϴ� ��ü�� ��ӹ��� �ʵ�
		test1.name="hong";  // ��ӹ��� �ʵ�
		
		//��ӹ��� �޼ҵ�
		test1.print();
		//ClassAA���� ���ǵ� �޼ҵ�
		test1.test();
		
		ClassAB test2= new ClassAB();
		test2.test();

	}

}
