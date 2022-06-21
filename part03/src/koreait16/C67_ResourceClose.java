package koreait16;

import java.awt.FileDialog;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFrame;


// �о�� �� �ִ� �ؽ�Ʈ������ ���ڵ��� ��ġ�ؾ� �մϴ�.
// workspace UTF-8�̸� �ؽ�Ʈ���� UTF-8 ���ĸ�
// workspace MS949�̸� �ؽ�Ʈ���� ANSI ���ĸ�
public class C67_ResourceClose {

	public static void main(String[] args) {
		// AutoCloseable �������̽���  ���ǵ� close() �޼ҵ带 �������̵� �Ͽ� ����
//				String filename = "C:\\class\\�ڹ��׽�Ʈ.txt";	//�б� : �����ϴ� ����
//				String filename2 = "C:\\class\\�ڹ��׽�Ʈ4.txt";	//���� : �������� �ʴ� ����
				
				//���� ��ȭ���� ����ϱ�
				String filename = fileDialogOpen();		// ������ ������ �����ϼ���.
				String filename2 = fileDialogSave();	// ������ ������ ������ ã�ư��� ���ϸ��� ���� ������.
				File ifile = new File(filename);		// ������ ����� ���ϸ����� ���ϰ�ü ��
				File ofile = new File(filename2);		
				try(PrintWriter pw = new PrintWriter(ofile);
						Scanner sc = new Scanner(ifile)
					){
					while(sc.hasNext()) {
						String temp = sc.nextLine();	// ���Ͽ��� �о�� 1��
						System.out.println(temp);		// ǥ�� ���(�ܼ�)
						pw.println(temp);				// ���� ���
					}
				} catch(FileNotFoundException e) {
					 e.printStackTrace();
				} catch(Exception e) {
					System.out.println("�˼� ���� ���� : " + e.getMessage());
				}
				
				}
	public static String fileDialogOpen() {		// �ܼ� ��������� �����ϴ� ���α׷� : CLI(Command Line Interface)  <-> GUI(Graphic User Interface) 
		// �ڹٿ����� GUI �� ����� �ִ� Ŭ�������� �ֽ��ϴ�. �� �� �ϳ��� ���ϴ�ȭ���ڸ� ����մϴ�. ���̺귯���� awt,swing,javaFX ���� �ֽ��ϴ�.
		// Windows OS�� �������α׷����� window��� Ʋ �ȿ��� ��������µ� �ڹٿ����� �װ��� �������̶�� �մϴ�.
				
				JFrame f = new JFrame();  //���ϴ�ȭ���ڸ� ������ �����Ӱ�ü ����
				
				FileDialog fdr = new FileDialog(f,"���� ����",FileDialog.LOAD);	//���ϴ�ȭ���� ��ü ����
				fdr.setVisible(true);		//���� ��ȭ���� ���̱�
				
				String filename = fdr.getDirectory() + fdr.getFile(); 	//������ ������ ��ο� ���ϸ� ����
				System.out.println("������ ��ο� ���� : " + filename);
				System.out.println("������ ��� : " + fdr.getDirectory() + ",������ ����:" + fdr.getFile());
				File file = new File(filename);
				System.out.println("������ ���� ũ�� : " + file.length() + " ����Ʈ");
				return filename;
	}
	public static String fileDialogSave() {
		JFrame f = new JFrame();  //���ϴ�ȭ���ڸ� ������ �����Ӱ�ü ����
		FileDialog fdw = new FileDialog(f, "���� ����",FileDialog.SAVE);
		fdw.setVisible(true);
		String filename = fdw.getDirectory() + fdw.getFile();
		System.out.println("������ ��ο� ���� : " + fdw.getDirectory() + fdw.getFile());
		
		return filename;
	}
	}
/*
 * AutoClosable Interface
 * try-with-resources ����� ����Ϸ��� ����ϴ� ��ü�� AutoClosable �������̽���
 * Implement�ؼ� ��� �����ؾ��� Scanner, PrintWriter ��  AutoClosable ���� Ŭ����
 * ==>> AutoClosable�� ������ ��ü��� try���� ����ɶ� close() ������ ȣ������
 * with-resources : Ű���尡 �ƴϰ� ���ҽ��� �ٷ��(ó���ϴ�) try��
 */

