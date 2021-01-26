package stream.example;

import java.util.*;

public class MemberTest {
	public static void main(String[] args) {
		Member member1 = new Member("�̼���", 40, 100);
		Member member2 = new Member("������", 20, 100);
		Member member3 = new Member("ȫ�浿", 13, 50);
		
		List<Member> memberList = new ArrayList<Member>();
		memberList.add(member1);
		memberList.add(member2);
		memberList.add(member3);
		
		System.out.println(memberList);
		
		memberList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		int total = memberList.stream().mapToInt(c->c.getCost()).sum();
		System.out.println(total);
		
		memberList.stream().filter(c->c.getAge()>=20).map(c->c.getName()).sorted().forEach(c->System.out.println(c));
	}
}
