package koreait16;

import java.io.File;	//io.input,output ����� ���õ� ��ɵ��� Ŭ����
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
// Exception ó�� ����� ���� �޼ҵ忡�� ���ǵɶ� �ٸ� ���:
public class C68_FileReadWrite {
	// main �޼ҵ尡 throws Exception �Ѵٸ� jvm���� �ѱ�ϴ�. ó�������� printStackTrace ����� ����
	public static void main(String[] args)  {

		String filename ="C:\\class\\�ڹ��׽�Ʈ.txt";
		
		try {
			fileWrite2(filename);
			filename = "C:\\class\\�ڹ��׽�Ʈ2.txt";
			fileRead(filename);
		} catch (FileNotFoundException e) {
			System.out.println("����� ���� ���� : " + e.getMessage());
			System.out.println("������ �����ϴ��� Ȯ���ϼ���.");
		}
	}
	// Exception�� try~catch�� ���� ó���մϴ�.
	// ������ �޼ҵ� java.io.PrintWriter.PrintWriter(File file) throws FileNotFoundException
	public static void fileWrite(String filename) {
		File file =new File(filename);
		//PrintWriter : ��� ����� ���� Ŭ����
		//Unhandled exception type FileNotFoundException : ������ ���ɼ��� �����Ƿ� try~catch �ʿ��ϴ�.
		PrintWriter pw = null;
		try {
		pw =new PrintWriter(file);	
		pw.println("��� 90 89 82");
		pw.println("���� 89 90 82");
		pw.println("���� 82 89 90");
		System.out.println("���� ����� �Ϸ�Ǿ����ϴ�.");	
	}	catch(FileNotFoundException e) {
		//��� ��ɿ��� ������ ������ �ڵ����� ������ ��������ϴ�.
		System.out.println("����� ���� �߻� : "+ e.getMessage());
	}finally {
		pw.close();
	}
	}
	// throws Ű����� �ش� Exceptionó���� ȣ���� ��(���⼱ main�޼ҵ�)���� �ѱ��.(���ѱ��)
	// throws �ڿ� Exception ������ , �� �����ؼ� �������� ������ �� �ֽ��ϴ�.
	// Exception ó���ؾ� �� �޼ҵ尡 ���� ���ǵǰ� ���� �� �� ������ ��� ó���� �� �ֽ��ϴ�.
	public static void fileWrite2(String filename) throws FileNotFoundException {
		File file =new File(filename);
		
		PrintWriter pw = null;
		pw =new PrintWriter(file);	
		pw.println("��� 90 89 82");
		pw.println("���� 89 90 82");
		pw.println("���� 82 89 90");
		System.out.println("���� ����� �Ϸ�Ǿ����ϴ�.");	
		pw.close();
	}
	public static void fileRead(String filename) throws FileNotFoundException {
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	} 
}
