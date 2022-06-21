package koreait10;

import koreait09a.Animal;
import koreait09a.Crow;
import koreait09a.Dog;

public class AnimalTEst4 {
	// Animal 클래스 isDog, isCrow 테스트 : 메소드 인자 Object(다형성 구현)
	public static void main(String[] args) {
		Animal animal = new Dog();
		Dog puddle = new Dog();
		Crow crow = new Crow();
		Animal animal2 = new Crow();
		
		// 메소드 인자로 Object 타입객체를 받는 메소드
		System.out.println(Animal.isCrow(puddle));
		System.out.println(Animal.isDog(puddle));
		System.out.println(Animal.isDog("동물"));
		System.out.println(Animal.isDog(1));
		System.out.println(Animal.isDog(animal));
		System.out.println(Animal.isDog(animal2));
		System.out.println(Animal.isDog(crow));

	}

}
