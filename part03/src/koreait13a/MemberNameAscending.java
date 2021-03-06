package koreait13a;

import java.util.Comparator;

import koreait12.Member;

// Member 객체의 sort: 비교 가능한 값으로 필드 중 하나를  선택해서 비교자(Comparator) 구현체 만듭니다.
public class MemberNameAscending implements Comparator<Member> {
	@Override
	public int compare(Member o1, Member o2) {
		String name1 = o1.getName();
		String name2 = o2.getName();
		return name1.compareTo(name2);	//오름차순 name1<name2 일때 -1을 리턴
	}

}
