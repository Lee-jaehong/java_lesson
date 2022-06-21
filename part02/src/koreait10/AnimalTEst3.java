package koreait10;

import koreait09a.Animal;
import koreait09a.Crow;
import koreait09a.Dog;

public class AnimalTEst3 {
	// ������ ���� ���� 3
	public static void main(String[] args) {
		// �θ�Ÿ�� Ŭ���� �迭 : �迭���� Animal Ÿ�� �ν��Ͻ� ��ü�� �������� ����.
		Animal[] animals = new Animal[10];
		
		animals[0]= new Frog();
		animals[1]= new Cat();
		animals[5]= new Dog();
		animals[7]= new Frog();
		animals[8]= new Crow();
		
		for (Animal temp : animals) {
			Cat cat;  Dog dog; Frog frog; Crow crow;
			if(temp!=null) {
			if(temp instanceof Cat) {
				cat = (Cat)temp;	// �ٿ�ĳ���� : ��¥ ��ü�� ���� ���� �Ǵ� ���� ����
				cat.sound();
			}
			if(temp instanceof Dog) {
				dog = (Dog)temp;
				dog.run();
			}
			if(temp instanceof Frog) {
				frog = (Frog)temp;
				frog.jump();
			}
			if(temp instanceof Crow) {
				crow = (Crow)temp;
				crow.fly();
			}
			
				temp.act();
				temp.print();
			
			}else{
			System.out.println("�������Դϴ�");
			System.out.println("::::");
		}
		
	}
	}
}

