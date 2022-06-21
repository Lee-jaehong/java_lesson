package koreait11test;

public class Dog extends Animal {
	
	protected int legs; // 디폴트 한정자+다른패키지 자식클래스
	
	public Dog() {
		System.out.println("새로운 동물가족은 dog");
		type = Animal.DOG;
	}
	@Override
	public void act() {
		System.out.println("Animal 행동 : 달리기");
		
	}@Override
	public String eat(Object object) {
		return "먹이는 "+object+" 입니다.";
	}
	
	public void run() {
		setName("강아지");
		setColor("브라운");
		System.out.println("특징 : 달리기");
	}
}
