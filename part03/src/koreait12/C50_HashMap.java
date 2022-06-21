package koreait12;

import java.util.Arrays;
import java.util.HashMap;

public class C50_HashMap {

	public static void main(String[] args) {
		String[] title = {"���İ�Ƽ","������ũ","������"};
		int[] price = {12000,22000,7000};
		//key�� �޴��̸�, value�� �������� �ϴ� hashmap ����
		//key�� �ߺ��� ������ ��� ���մϴ�.(������ ��)
		HashMap<String, Integer> menus = new HashMap<>();
		//������ ���� : put() �޼ҵ�
		menus.put("���İ�Ƽ",12000);
		menus.put("������ũ",22000);
		menus.put("������",7000);
		
		System.out.println("1. ����� ������ ���");
		System.out.println(menus);
		// ������ ����(�б�) : get() �޼ҵ�
		System.out.println("2. Ư���� key���� value ���");
		System.out.println("'���İ�Ƽ'�� ������? " + menus.get("���İ�Ƽ"));
		System.out.println("'������ũ'�� ������? " + menus.get("������ũ"));
		System.out.println("'������'�� ������? " + menus.get("������"));
		
		// key �� �ߺ��Ǹ�?
		menus.put("������", 8200);
		System.out.println(menus);
		// ������ ���� : remove() �޼ҵ�
		System.out.println("3. Ư�� ��� ����");
		menus.remove("������ũ");
		System.out.println("���� ��� Ȯ�� : " + menus);
		menus.remove("������", 6000);	// ���� key,value : key�� value�� ��� ��ġ�ؾ� ����
		menus.remove("������", 8200);	
		System.out.println("���� ��� Ȯ�� : " + menus);
		
	}

}
/*ArrayList : ������(�ε����� ����) ���� �����͸� �����ϴ� �ڷᱸ���Դϴ�.�迭�� ������ �����Դϴ�.
HashMap : �������� ������ �ƴմϴ�. �ε����� ������� �װ� Key ���� �̿��Ͽ� �����������Ͽ� ����/�б� �մϴ�.
			*�˻�*�� ���� �˰����� �����մϴ�. 
  		���ʸ� Ÿ���� K:Key , V:Value �ѽ��Դϴ�. 
  		(hashmap������ key,value �ѽ����� ��Ұ� �˴ϴ�.value�� �˻��ϱ� ���ؼ� key�� ����մϴ�.)
 ArrayList �� ���������� int,long,double �⺻�� Ÿ�� ��ſ� ����(wrapper)Ŭ������ ǥ���մϴ�.
*/