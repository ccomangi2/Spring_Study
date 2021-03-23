package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 t1 = ctx.getBean("obj1", TestBean1.class);
		System.out.println("t1 : " + t1);
		
		TestBean1 t2 = ctx.getBean("obj1", TestBean1.class);
		System.out.println("t2 : " + t2);
		
		TestBean1 t3 = ctx.getBean("obj4", TestBean1.class);
		System.out.println("t3 : " + t3.getD1());
		System.out.println("====================================");
		TestBean1 t4 = ctx.getBean("obj5", TestBean1.class);
		System.out.println("t4 : " + t4.getD1());
		System.out.println("====================================");
		
		TestBean1 t5 = ctx.getBean("obj5", TestBean1.class);
		System.out.println("t5 : " + t5.getD1());
		
		TestBean1 t6 = ctx.getBean("obj6", TestBean1.class);
		System.out.println("t6 : " + t6 );
		
		ctx.close();
	}
}
