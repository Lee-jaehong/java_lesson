package koreait11test;

public class Dog extends Animal {
	
	protected int legs; // ����Ʈ ������+�ٸ���Ű�� �ڽ�Ŭ����
	
	public Dog() {
		System.out.println("���ο� ���������� dog");
		type = Animal.DOG;
	}
	@Override
	public void act() {
		System.out.println("Animal �ൿ : �޸���");
		
	}@Override
	public String eat(Object object) {
		return "���̴� "+object+" �Դϴ�.";
	}
	
	public void run() {
		setName("������");
		setColor("����");
		System.out.println("Ư¡ : �޸���");
	}
}
