package koreait11;

public class AShapeTest {
// main �޼ҵ�� Ŭ������ ������� ���ø����̼��Դϴ�. �߻�Ŭ������ �ϼ��� ���ø����̼ǿ��� ���ο� �߻�޼ҵ带 �߰��ϸ�?
	public static void main(String[] args) {
		
		Triangle tri = new Triangle(100, 84);
		System.out.println(tri);
		System.out.println("���� = " + tri.getArea());
		
		Circle cir = new Circle();
		cir.setRadius(89);
		System.out.println(cir);
		System.out.println("���� = " + cir.getArea());
		
	}

}//AShapeTest
/*
 * ����: �޼ҵ� ������ �Ҷ� ����������
 * �θ�  public -> �ڽ� default : ����
 * �θ� default -> �ڽ� public : ����
 */

abstract class AShape {		// ����
	protected String shapeName;
	protected int width;
	protected int height;
	public AShape() {
		System.out.println("AShape ����Ʈ ������ �����մϴ�.");
	}
	public AShape(int width, int height) {	//AShape() �� ��ü�� ���� ������� �ڽ� ��ü ����� ���� ����
		System.out.println("AShape Ŀ���� ������ �����մϴ�.");
		this.width=width;
		this.height=height;
	}
	
	public abstract double getArea();
	// �߻�Ŭ������ �ν��Ͻ� �޼ҵ� �����ؼ� �ڽ� Ŭ������ ������ �� �� �ֽ��ϴ�.
	public Object explain() {		//���ø����̼� �Ϸ� �� �߻�޼ҵ� �߰� ���� �߻��ϹǷ� �ν��Ͻ� �޼ҵ� �߰�
		return null;
	}
}
class Triangle extends AShape{	//width* height/2
	public Triangle(int width, int height) {
		super(width, height);
		shapeName="�ﰢ��";
	}
	public Triangle() {
		shapeName="�ﰢ��";
	}
	@Override
	public String toString() {
		return "Triangle [shapeName=" + shapeName + ", width=" + width + ", height=" + height + "]";
	}
	@Override
	public double getArea(){
		return width*height/2;
	}
}
class Circle extends AShape{	// ������*������*3.14
	private int radius; // ������
	public Circle() {
		shapeName="��";
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", shapeName=" + shapeName + ", width=" + width + ", height=" + height
				+ "]";
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	@Override
	public double getArea() {
		return radius * radius * 3.14;
	}
}

class Rectangle extends AShape{ // width*height
	public Rectangle() {
		shapeName="�簢��";
	}
	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public String toString() {
		return "Rectangle [shapeName=" + shapeName + ", width=" + width + ", height=" + height + "]";
	}
	
}