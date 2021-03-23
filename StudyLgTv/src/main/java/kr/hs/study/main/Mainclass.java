package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.SamsungTv;
import kr.hs.study.beans.LgTv;
import kr.hs.study.beans.Tv;

public class Mainclass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Tv samsung = ctx.getBean("samsungTv", SamsungTv.class);
		System.out.println("--------SamsungTv--------");
		samsung.powerOn();
		samsung.volumeUp();
		samsung.volumeDown();
		samsung.powerOff();
		
		Tv lg = ctx.getBean("lgTv", LgTv.class);
		System.out.println("----------LgTv-----------");
		lg.powerOn();
		lg.volumeUp();
		lg.volumeDown();
		lg.powerOff();
	}
}
