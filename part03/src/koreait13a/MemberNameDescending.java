package koreait13a;

import java.util.Comparator;

import koreait12.Member;

// Member 객체의 sort: 비교 가능한 값으로 필드 중 하나를  선택해서 비교자(Comparator) 구현체 만듭니다.
public class MemberNameDescending implements Comparator<Member> {
	@Override
	public int compare(Member o1, Member o2) {
		String name1 = o1.getName();
		String name2 = o2.getName();
		return name2.compareTo(name1);	//내림차순
	}

}
