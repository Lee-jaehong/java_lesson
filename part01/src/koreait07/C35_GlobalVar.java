package koreait07;

public class C35_GlobalVar {
	/*
	 * [������ ����� ��ġ�� ����]
	 * ��������(local variable) : �޼ҵ�, if, for, while ��� {} ���� ����� ����. ����� ����� ����������
	 * ��������(global variable) : Ŭ���� {} ���� ����� ����
	 * 
	 * [���������� static ���η� ����]
	 * Ŭ�����̸�.������
	 * ��ü�� ���� ����ϴ� this.������ (�̶� ������ �ν��Ͻ� ����)
	 * 
	 * ���������� Ŭ�����Ǵ� ��ü�� Ư���� ��Ÿ���� �ʵ�(�Ǵ� ������Ƽ) ��� �θ��ϴ�.
	 */
    int count; //��������
    String message;
    static int num;
    static double point;
    static final int TEST = 9999; // static final�� ���.�����Ҷ� �ʱ�ȭ ���� ������ ����
	public static void main(String[] args) { //static�� static������ �����մϴ�.
		
		int num=10; // ���θ޼ҵ忡���� ���
		System.out.println("num = " + num);  // 10
		// System.out.println("message = " + message); // ����: static�� �ƴ� ������ ������
		methodB();
		// methodA(); // ����: static�� �ƴ� �޼ҵ�
	}
	public void methodA() {
		int num=99; // methodA ������ ���
		System.out.println("num = " + num);  // 99
		System.out.println("message = " + message); 
	}
	// *** �߿�
	public void methodC(int count) {
		this.count=count;  // this�� new�� ������� ��ü. methodC �޼ҵ带 �����Ű�� ��ü
	}
	public static void methodB() {
		int num=99; // methodB ������ ���
		// ���������� �������� �̸��� �������.
		System.out.println("num = " + num);  // 99
		System.out.println("num = " + C35_GlobalVar.num);// Integer.BYTE �� ���� ����
		// ���������� ����� num. static �϶��� Ŭ�����̸�. ������/ static �ƴҶ��� this
	}
	
}
