package koreait09a;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.act();
		animal.print();
		System.out.println("-----------------------------------------");
		
		Dog dog = new Dog();
		dog.run();
		dog.print();
		dog.legs=4;
		System.out.println("-----------------------------------------");
		
		Crow crow = new Crow();
		crow.fly();
		crow.print();
		crow.wings=2;
		System.out.println("::::::::::::::::::::::::::::::::::::::::");
		Animal temp= dog;  // �ڽ� ��ü�� �θ�Ŭ���� Ÿ������ �����Ҽ� �ֽ��ϴ�. (�ڽ�Ŭ������ �θ�Ŭ����Ÿ������ �ڵ�ĳ����)
		temp.print();
//		temp.run();        // ����: �θ�Ÿ�� �����δ� �ڽ� �޼ҵ� ���� ���մϴ�.
		temp=crow;         //           "
		temp.print();
//		temp.fly();        // ����: �θ�Ÿ�� �����δ� �ڽ� �޼ҵ� ���� ���մϴ�.
		System.out.println("-----------------------------------------");
		Animal puppy = new Dog();
		puppy.print();
//		puppy.run();      // ����: �θ�Ÿ�� �����δ� �ڽ� �޼ҵ� ���� ���մϴ�.
		
		Dog puddle  = (Dog)puppy; // Animal Ÿ���� Dog Ÿ������ ���� casting.(�ڽ�Ŭ���� Dog��ü�̹Ƿ� ����)
		puddle.run();		      //  puppy ������ �����ϴ� ��ü�� Dog Ÿ���϶��� ����.
		puddle.print();

	}

}
