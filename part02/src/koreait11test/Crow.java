package koreait11test;

public class Crow extends Animal {
	
	protected int wings; // ����Ʈ ������+�ٸ���Ű�� �ڽ�Ŭ����
	
	public Crow() {
		System.out.println("���ο� ���������� crow");
		type = Animal.CROW;
	}
	@Override
	public void act() {
		System.out.println("Animal �ൿ : ����");
		
	}
	@Override
	public String eat(Object object) {
		return "���̴� ������" + object + "���� �Դϴ�.";
	}
	
	public void fly() {
		setName("���");
		setColor("������");
		System.out.println("Ư¡ : ����");
	}
}
