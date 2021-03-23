package kr.hs.study.main;

import kr.hs.study.beans.Person;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("lee", 25);
		
		System.out.println("====================");
		System.out.println("이름은" + p.getName());
		System.out.println("나이는" + p.getAge());
	}
}