package koreait08a;

import koreait08.MyClass1;
import koreait08.Score;

public class MyClass1Test {
	public static void main(String[] args) {
	
	// MyClass1 ��ü ����
	MyClass1 my = new MyClass1();
	
	// ��Ű���� �ٸ� MyClass1Ŭ������ �ʵ� �� ��� �� �� �ִ� ����? �� : point
	//                   default(package) ������ �ʵ� name, �޼ҵ� getAge,setAge ������
//	my.name="momo";
	my.point=1.234;
//  my.age=23; // ����:private ������ �ʵ�
//	my.setAge(23); 
//	system.out.println("age"+ my.age); // ����: private ������ �ʵ�
//	System.out.println("age = " + my.getAge()); 
//	my.setAge(-100);
//	System.out.println("age = " + my.getAge()); 
	System.out.println("point = " + my.point); // public ������ �ʵ�
//	System.out.println("name = " + my.name); 
	
	
	// Score Ŭ���� �ʵ�, �޼ҵ��� �����ڰ� ��� default �Դϴ�.
	//       �� new ��ü������ �ɱ��? class�� public �������̹Ƿ� ������
	Score score = new Score();
	

	
	}
// ���� ������ �׽�Ʈ�� �ڹٿ��� �����Ǵ� Ŭ�������� �����ϰ� �츮�� ���� Ŭ�������� ��밡��
}
