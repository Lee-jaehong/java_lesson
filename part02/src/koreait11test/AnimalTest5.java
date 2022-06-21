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
	
	protected String mouth; // 디폴트 한정자+다른패키지 자식클래스
	
	public Frog() {
		System.out.println("새로운 동물가족은 frog");
		type = Animal.FROG;
	}@Override
	public String eat(Object object) {
		return "개구리 먹이는" + object + "개 만큼 있습니다.";
	}
	
	
	public void jump() {
		setName("개구리");
		setColor("초록");
		System.out.println("특징 : 점핑");
	}
	// 다형성 구현 : 메소드 오버라이드   * 참고: 오버로딩(overloading)
	//				ㄴ 부모클래스의 메소드를 재정의 이 때 인자와 리턴타입은 동일하게 합니다.
	@Override
	public void act() {
		System.out.println("Animal 행동 : 점프하기");
	}

}
class Cat extends Animal {
	
	protected String eyes; // 디폴트 한정자+다른패키지 자식클래스
	
	public Cat() {
		System.out.println("새로운 동물가족은 cat");
		type = Animal.CAT;
	}@Override
	public String eat(Object object) {
		return null;
	}

	
	public void sound() {
		setName("고양이");
		setColor("하얀색");
		System.out.println("특징 : 야옹");
	}
	@Override
	public void act() {
		System.out.println("Animal 행동 : 야옹하기");
		
	}
	
	}

