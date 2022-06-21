package koreait.test;

public class Test {

	public static void main(String[] args) {
		Product[] cart = new Product[5];
		cart[0] = new Bike(123000,"MTB",25);
		cart[3] = new Bike(99000,"삼천리",15);
		for(int i=0;i<cart.length;i++)
			if(cart[i]!=null&&cart[i].price>100000)
				System.out.println(cart[i]);
		
	}
	// 자식 객체 타입 검사 : instanceOf, 다운캐스팅
	// 메소드 정의: 리턴값형식, 인자의 타입과 개수
}
