package koreait13;

public class MyClassY implements InterfaceB{
	@Override
	public String name(String name) {
		
		return "MyClassY : " + name;
}
}
// ���� ���� : InterfacA, InterfaceB�� ����ü(����Ŭ����, ��ü)
class MyClassZ implements InterfaceA, InterfaceB{
	@Override
	public void methodA() {
		System.out.println("MyClassX methodA");
		
	}@Override
	public int methodB(int num) {
		System.out.println("MyClassX methodB" + num);
		return 3333;
	}@Override
	public String name(String name) {
		// TODO Auto-generated method stub
		return "MyClassY : " + name;
	}
}

