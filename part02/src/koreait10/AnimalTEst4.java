package koreait10;

import koreait09a.Animal;
import koreait09a.Crow;
import koreait09a.Dog;

public class AnimalTEst4 {
	// Animal Ŭ���� isDog, isCrow �׽�Ʈ : �޼ҵ� ���� Object(������ ����)
	public static void main(String[] args) {
		Animal animal = new Dog();
		Dog puddle = new Dog();
		Crow crow = new Crow();
		Animal animal2 = new Crow();
		
		// �޼ҵ� ���ڷ� Object Ÿ�԰�ü�� �޴� �޼ҵ�
		System.out.println(Animal.isCrow(puddle));
		System.out.println(Animal.isDog(puddle));
		System.out.println(Animal.isDog("����"));
		System.out.println(Animal.isDog(1));
		System.out.println(Animal.isDog(animal));
		System.out.println(Animal.isDog(animal2));
		System.out.println(Animal.isDog(crow));

	}

}
