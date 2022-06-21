package koreait11test;


public class AnimalTest5 {

	public static void main(String[] args) {
		Animal ani = new Frog();
		ani.act();
		Dog dog = new Dog();
		dog.act();
		Cat cat =  new Cat();
		cat.act();

	}

}
class Frog extends Animal {
	
	protected String mouth; // ����Ʈ ������+�ٸ���Ű�� �ڽ�Ŭ����
	
	public Frog() {
		System.out.println("���ο� ���������� frog");
		type = Animal.FROG;
	}@Override
	public String eat(Object object) {
		return "������ ���̴�" + object + "�� ��ŭ �ֽ��ϴ�.";
	}
	
	
	public void jump() {
		setName("������");
		setColor("�ʷ�");
		System.out.println("Ư¡ : ����");
	}
	// ������ ���� : �޼ҵ� �������̵�   * ����: �����ε�(overloading)
	//				�� �θ�Ŭ������ �޼ҵ带 ������ �� �� ���ڿ� ����Ÿ���� �����ϰ� �մϴ�.
	@Override
	public void act() {
		System.out.println("Animal �ൿ : �����ϱ�");
	}

}
class Cat extends Animal {
	
	protected String eyes; // ����Ʈ ������+�ٸ���Ű�� �ڽ�Ŭ����
	
	public Cat() {
		System.out.println("���ο� ���������� cat");
		type = Animal.CAT;
	}@Override
	public String eat(Object object) {
		return null;
	}

	
	public void sound() {
		setName("�����");
		setColor("�Ͼ��");
		System.out.println("Ư¡ : �߿�");
	}
	@Override
	public void act() {
		System.out.println("Animal �ൿ : �߿��ϱ�");
		
	}
	
	}

