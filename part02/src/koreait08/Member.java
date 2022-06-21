package koreait08;
// 작성자 : 이재홍
public class Member {
	private String name;
	private String email;
	private int age;
	private int level;
	
	public Member(String name, String email) { 
		this.name = name;
		this.email=email;
	}
	public Member() {
		System.out.println("name,email,age,level 필드는 기본값입니다.");
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getLevel() {
		return level;
	}
	public String getEmail() {
		return email;
	}
	public String getName() {
		return name;
	}

	
}
