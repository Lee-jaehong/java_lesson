package koreait04;
// ����ȫ
import java.util.Scanner;

public class C21_StringEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String email, account, domain;
		boolean isValid = true;
		int idx;
		System.out.print("����� �̸��� �Է��ϼ���. >>> ");
		email = sc.nextLine(); // Ű���� �Է��� ���ڿ��� ó���մϴ�.
		idx = email.indexOf('@');
		domain = email.substring(idx + 1, email.length());
		// �Է��� �̸����� ó������ 1, 2, 4, 5�� �ش����� ������ �޽��� ����ϰ� isValid ������ false�� �մϴ�.
	   
		if (idx != -1 && idx == email.lastIndexOf('@')) {
			domain = email.substring(idx + 1, email.length());
			System.out.println(domain);
			
			if (domain.equals("gmail.com")) {
				account = email.substring(0, idx);
				
			    if (account.length() >= 6) {
			    	if (!(email.indexOf('$') == -1 && email.indexOf('%') == -1)) {
			    		System.out.println("��ȿ���� ���� Ư����ȣ�Դϴ�.");
			    		isValid = false;
			    	}
			   } else {
			    	System.out.println("�����̸��� 6���� �̻��Դϴ�.");
			    	isValid = false;
			          }
			} else {
			    	System.out.println("������ �ּҰ� Ʋ�Ƚ��ϴ�.");
			    	isValid = false;
			}
			} else {
				System.out.println("@�� ���� �Ǿ�� �մϴ�.");
				isValid = false;
			}
		System.out.println(isValid);
	
	}
}
			    
			
	
/* ���� �̸��� ������ üũ�ϴ� ��� ����
/*  ���� �̸��� ������ üũ�ϴ� ��� ���� 
 *  1. @ ��ȣ�� 1�� ���ԵǾ�� �մϴ�.	(�޽��� : �̸��� ������ �ƴմϴ�.)
 *  		�� indexof �� -1�� �ƴϰ� indexof �� lastindexof �� ���� ���ΰ�?
 *  
 *  2. 1���� ���� �� @ �ڿ��� gmail.com �̾�� �մϴ�. (�޽��� : ������ �̸��� Ʋ���ϴ�.)
 *  		�� '@' �� indexof �� ���ؼ� �� �ں��� ������ substring ������ ���ڿ��� equals ��
 *  
 *  3. 2���� ���� �� @ �ձ����� ���ڿ�(�����̸�)�� �����մϴ�.
 *  		�� '@' �� indexof �� ���ؼ� ó�� ���� '@' ���� ������ ���ڿ� substring ����
 *  
 *  4. 3���� �����̸��� 6���� �̻��̾�� �մϴ�.
 *  		�� 3���� ���ڿ��� length() �� 6���� ��
 *  
 *  5. 3���� �����̸����� Ư����ȣ $,%�� ���ԵǸ� �ȵ˴ϴ�. 
 *   		�� indexof('$') , indexof('%') �� ��� -1�� �ƴϸ� �����ϴ� ��ȣ ����
 */

 
