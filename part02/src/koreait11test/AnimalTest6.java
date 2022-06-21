package koreait11test;

public class AnimalTest6 {

	public static void main(String[] args) {
		Animal[] animals = new Animal[10];
		animals[0] = new Dog();
		animals[2] = new Dog();
		animals[8] = new Dog();
		animals[3] = new Frog();
		animals[3].setName("개굴A");
		animals[4] = new Frog();
		animals[4].setName("개굴B");
		animals[6] = new Crow();
		
		for(Animal temp : animals)
			if(temp != null) {
				temp.act();
			}
		// 현재시간 : ms, ns(1970년 1월 1일  자정을 기준으로 단위마다 카운트한 값)
		System.out.println("현재시간.......");
		System.out.println(System.currentTimeMillis() + "ms"); // 0.001초
		System.out.println(System.nanoTime() + " ns"); // 0.00000001초
		int cnt=0;	//카운트 변수
		long start = System.nanoTime(); // 현재 시간을 ns(0.00000001초) 단위로 구함
		for(Animal temp : animals) {
			if(temp != null && temp instanceof Frog) {
				cnt++;
				System.out.println(temp.eat(100));
			}
		}
		long end = System.nanoTime();
		System.out.println("강아지 먹이주는데 걸린시간"+ (end-start) + "ns");
		System.out.println("개구리는" + cnt + " 마리 살고 있습니다.");
		// 강아지가 몇마리인지
		cnt=0;
		start = System.nanoTime();
		for (Animal temp:animals) {
			if(temp !=null && temp.type == Animal.DOG) {
				cnt++;
				System.out.println(temp.eat("맛있는 간식"));
			}
			}
		end = System.nanoTime();
		System.out.println("강아지 먹이주는데 걸린시간"+ (end-start) + "ns");
		System.out.println("강아지는" + cnt + " 마리 살고 있습니다.");
		System.out.println("까마귀 먹이주기");
		System.out.println(animals[6].eat(animals[3])); 
	}

}
