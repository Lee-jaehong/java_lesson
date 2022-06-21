package koreait11test;

public abstract class Animal {
	
	//미리 약속된 상수값으로 type을 정하는 예시
	static final int CAT =1;
	static final int DOG =2;
	static final int CROW =3;
	static final int FROG =4;
	static final int SNAKE =5;
	
	private String name;
	private String color;
	protected int type;
	
	public Animal() {
		System.out.println("새로운 Animal 가족이 생겼습니다.");
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", color=" + color + ", type=" + type + "]";
	}
	public abstract void act(); {
		
	}
	public abstract String eat(Object object);

	
	// getter,setter
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void print() {
		System.out.println("name :" + name + ",color :" + color);
	}
}
