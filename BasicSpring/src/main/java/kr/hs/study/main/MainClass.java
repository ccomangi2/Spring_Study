package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Test;
import kr.hs.study.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// 컨테이너의 config.xml 파일을 읽어온다.
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Test t1 = ctx.getBean("t1", TestBean.class);
		System.out.println("t1: "+t1);
		
		Test t2 = ctx.getBean("t1", TestBean.class);
		System.out.println("t2: "+t2);
		
		Test t3 = ctx.getBean("t1", TestBean.class);
		System.out.println("t3: "+t3);
		
		ctx.close();
	}
}
