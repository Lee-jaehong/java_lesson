package koreait13a;

import java.util.Comparator;

import koreait12.Member;

// Member ��ü�� sort: �� ������ ������ �ʵ� �� �ϳ���  �����ؼ� ����(Comparator) ����ü ����ϴ�.
public class MemberNameAscending implements Comparator<Member> {
	@Override
	public int compare(Member o1, Member o2) {
		String name1 = o1.getName();
		String name2 = o2.getName();
		return name1.compareTo(name2);	//�������� name1<name2 �϶� -1�� ����
	}

}
