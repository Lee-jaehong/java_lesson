package koreait14;

@FunctionalInterface
public interface FunctionA {
	int methodA(int a, int b);
	

}

//�Լ��� �������̽� : �������̽� �߿� *�߻�޼ҵ尡 1���� ��*�� �ٸ� ���α׷��� ���� ���Ǵ� �Լ��� �������� ǥ���� �� �ֽ��ϴ�.
//  �ٸ� ���α׷��־���     �ڹٿ��� -> ��ȣ�� �ٿ��� ���ϴ�.(���ٽ�) ������, ���Ἲ�� ���ؼ� ����մϴ�.

// �߻�޼ҵ� �̸��� �߿����� �ʽ��ϴ�.
// ����: ���ϰ�, ����(�Ű�����)
// �ڹٿ��� ���Ŀ� ���� ����� �� �ִ� �������� �Լ��� �������̽��� �ֽ��ϴ�. : Consumer,Producer, Predicate,...