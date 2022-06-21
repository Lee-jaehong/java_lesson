package koreait04;

public class C20_StringMethod {

	public static void main(String[] args) {
		String message = "hello~";   // java.lang.String (�⺻��Ű�� Ŭ����)
		

		int len = message.length();
		char temp = message.charAt(3);  // 0���� �����ؼ� 3�� ���ڰ� �������� ����.
		boolean isstate = message.contentEquals("Hello~");  // ���ڿ��� ������ 
		 
		System.out.println("length() = " + len);
		System.out.println("charAt(3) = " + temp);
		System.out.println("eqauls(\"Hello\") = " + isstate);
		
		System.out.println("message.indexOf('e')" + message.indexOf('e'));  //  1����ġ
		System.out.println("message.indexOf(\"lo\")" + message.indexOf("lo")); // 3����ġ
		System.out.println("message.indexOf(\"lo\")" + message.indexOf("ol")); // -1 : ã�� ���ڿ��� ������
		String test = "hello~hello~";
		System.out.println("test.indexOf(\"lo\")" + test.indexOf("lo"));
		System.out.println("test.lastindexOf(\"lo\")" + test.lastIndexOf("lo"));
		System.out.println("message.substring(2)" + message.substring(2)); // �κ����� : llo~
		System.out.println("message.substring(2, 4)" + message.substring(2, 4)); // ll, 2������ 2��(4-2)
		System.out.println("message.replace(\"11\", \"*@\")" + message.replace("ll", "*@")); // ġȯ: he*@o~
		System.out.println("startsWith(\"H\")" + message.startsWith("H")); // false
		System.out.println("endsWith(\"~\")" + message.endsWith("~")); //true

	}
    // "�� ����Ҷ��� \(��������) �ʿ��մϴ�. -> "��ȣ�� ���ڿ��������� �ؼ��Ǳ� �����Դϴ�.
}
//String Ŭ������ �޼ҵ�� �����ϴ�. �� �ܿ�� ����ϴ� ���� �ƴϰ� �޼ҵ��� �̸�, ����, ���������� �����ؼ� ����մϴ�.

//message.length();  //public int length() : ����
//message.charAt(0);  // public char charAt(int index)

//message.equals("Hello");  // public boolean equals(Object anObject) Object�� ��� Ÿ��
                          // message �� String Ÿ���̹Ƿ� Object�� String���� �ؼ��մϴ�.

//���ϰ� ������?
/*		
message.indexOf('e');
message.indexOf("lo");
message.substring(2);
message.substring(2, 4);
message.replace("11", "*@");
*/		
//�޼ҵ� �����ε�(overloading) : �޼ҵ� �̸��� ���������� ���� ���ڰ��� ������ ������ �ٸ��� ���ǵ� ��.