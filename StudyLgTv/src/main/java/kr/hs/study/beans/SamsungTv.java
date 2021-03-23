package kr.hs.study.beans;

public class SamsungTv implements Tv {

	public void volumeUp() {
		System.out.println("SamsungTv의 볼륨을 키웠습니다.");
	}

	public void volumeDown() {
		System.out.println("SamsungTv의 볼륨을 낮췄습니다.");
	}

	public void powerOn() {
		System.out.println("SamsungTv의 전원이 켜졌습니다.");
	}

	public void powerOff() {
		System.out.println("SamsungTv의 전원이 꺼졌습니다.");
	}

}
