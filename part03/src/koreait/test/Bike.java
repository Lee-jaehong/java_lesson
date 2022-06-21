package koreait.test;

public class Bike extends Product {
	public Bike() {
		
	}
	public Bike(int price, String prdName, int speed) {
		this.price=price;
		this.prdName=prdName;
		this.speed=speed;
	}
	private int speed;
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
	@Override
	public String sell(Object ob) {
		return String.format("추가 할인 행사 = %d%%인하", ob);
	}
	@Override
	public String toString() {
		return "Bike [speed=" + speed + ", price=" + price + ", prdName=" + prdName + "]";
	}

}
