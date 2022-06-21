package koreait11test;

public class AnimalTest6 {

	public static void main(String[] args) {
		Animal[] animals = new Animal[10];
		animals[0] = new Dog();
		animals[2] = new Dog();
		animals[8] = new Dog();
		animals[3] = new Frog();
		animals[3].setName("����A");
		animals[4] = new Frog();
		animals[4].setName("����B");
		animals[6] = new Crow();
		
		for(Animal temp : animals)
			if(temp != null) {
				temp.act();
			}
		// ����ð� : ms, ns(1970�� 1�� 1��  ������ �������� �������� ī��Ʈ�� ��)
		System.out.println("����ð�.......");
		System.out.println(System.currentTimeMillis() + "ms"); // 0.001��
		System.out.println(System.nanoTime() + " ns"); // 0.00000001��
		int cnt=0;	//ī��Ʈ ����
		long start = System.nanoTime(); // ���� �ð��� ns(0.00000001��) ������ ����
		for(Animal temp : animals) {
			if(temp != null && temp instanceof Frog) {
				cnt++;
				System.out.println(temp.eat(100));
			}
		}
		long end = System.nanoTime();
		System.out.println("������ �����ִµ� �ɸ��ð�"+ (end-start) + "ns");
		System.out.println("��������" + cnt + " ���� ��� �ֽ��ϴ�.");
		// �������� �������
		cnt=0;
		start = System.nanoTime();
		for (Animal temp:animals) {
			if(temp !=null && temp.type == Animal.DOG) {
				cnt++;
				System.out.println(temp.eat("���ִ� ����"));
			}
			}
		end = System.nanoTime();
		System.out.println("������ �����ִµ� �ɸ��ð�"+ (end-start) + "ns");
		System.out.println("��������" + cnt + " ���� ��� �ֽ��ϴ�.");
		System.out.println("��� �����ֱ�");
		System.out.println(animals[6].eat(animals[3])); 
	}

}
