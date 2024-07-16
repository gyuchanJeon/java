package ch08.sec06;

import ch08.sec02.Audio;
import ch08.sec04.Television;

public class RemoteControlExample {
	public static void main(String[] args) {
		// 인터페이스 변수 선언
		RemoteControl rc;

		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);

		rc.setMute(true);
		rc.setMute(false);

		System.out.println();

		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);

		rc.setMute(true);
		rc.setMute(false);

		System.out.println();

		RemoteControl.changeBattery();
	}
}
