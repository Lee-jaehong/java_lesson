package koreait.test;

public class Test {

	public static void main(String[] args) {
		Product[] cart = new Product[5];
		cart[0] = new Bike(123000,"MTB",25);
		cart[3] = new Bike(99000,"��õ��",15);
		for(int i=0;i<cart.length;i++)
			if(cart[i]!=null&&cart[i].price>100000)
				System.out.println(cart[i]);
		
	}
	// �ڽ� ��ü Ÿ�� �˻� : instanceOf, �ٿ�ĳ����
	// �޼ҵ� ����: ���ϰ�����, ������ Ÿ�԰� ����
}
