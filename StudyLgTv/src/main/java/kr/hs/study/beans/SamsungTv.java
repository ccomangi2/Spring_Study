package kr.hs.study.beans;

public class SamsungTv implements Tv {

	public void volumeUp() {
		System.out.println("SamsungTv�� ������ Ű�����ϴ�.");
	}

	public void volumeDown() {
		System.out.println("SamsungTv�� ������ ������ϴ�.");
	}

	public void powerOn() {
		System.out.println("SamsungTv�� ������ �������ϴ�.");
	}

	public void powerOff() {
		System.out.println("SamsungTv�� ������ �������ϴ�.");
	}

}
