package koreait10;

public class ConsturctorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Product{
	int pirce;
	
	//����Ʈ �����ڴ� ������ ���մϴ�.

	public Product(int price) {
		this.pirce=price;
	}
}
class Food extends Product{ //Product() ����Ʈ ������ �����ϹǷ� ������ ���� -> Food() ����Ʈ ������ ����
	public Food(int price) {
		super(price);
	}
}

class Electronics extends Product{ // Product() ����Ʈ ������ ����
	// Product() ����Ʈ ������ super() �����ϸ� ����
	public Electronics(int price) {
		super(price);		// super() ����Ʈ ������ ��ſ� Ŀ���� ������ ȣ��
	}
}

