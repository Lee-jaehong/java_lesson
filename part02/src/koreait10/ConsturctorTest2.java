package koreait10;

public class ConsturctorTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Product2 {
	int pirce;
	//�θ�Ŭ���� ����Ʈ ������ �����ؼ� �ڽ�Ŭ������
	//����Ҽ� �ֵ��� �մϴ�.
	public Product2() {
	
	}
	public Product2(int price) {
		this.pirce=price;
	}
}
class Food2 extends Product2{ //Product() ����Ʈ ������ �����ϹǷ� ������ ���� -> Food() ����Ʈ ������ ����
	// �θ�Ŭ���� Product2 ����Ʈ ������ super()�� ȣ��
	// Food2 ����Ʈ �����ڴ� �ڵ����� ���۵˴ϴ�.
}

class Electronics2 extends Product2{ // Product() ����Ʈ ������ ����
	public Electronics2(int price) {
		super(price);	// �θ�Ŭ���� Ŀ���� ������ ����
	}
}

