package koreait10;

import koreait09a.Animal;
import koreait09a.Crow;
import koreait09a.Dog;

public class AnimalTEst3 {
	// 다형성 구현 예시 3
	public static void main(String[] args) {
		// 부모타입 클래스 배열 : 배열에는 Animal 타입 인스턴스 객체의 참조값이 저장.
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
				cat = (Cat)temp;	// 다운캐스팅 : 진짜 객체에 따라 오류 또는 오류 없음
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
			System.out.println("널참조입니다");
			System.out.println("::::");
		}
		
	}
	}
}

