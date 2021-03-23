package kr.hs.study.main;

import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKo;
import kr.hs.study.beans.hellointer;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hellointer hello = new HelloWorldEn();
		
		hello.sayHello();
	}
}
