package inheritance.quiz;

public class Quiz2 {

	public static void main(String[] args) {

		// BasicTV 생성
		BasicTV basicTV = new BasicTV();
		basicTV.isPowerOn = true;
		basicTV.channel = 7;
		basicTV.volume = 20;

		basicTV.showInfo();

		// SmartTV 생성
		SmartTV smartTV = new SmartTV();
		smartTV.isPowerOn = true; // 부모가 물려준 속성
		smartTV.channel = 11; // 부모가 물려준 속성
		smartTV.volume = 30; // 부모가 물려준 속성
		smartTV.ip = "192.168.0.111";

		smartTV.showInfo();

	}

}

// 베이직 티비
class BasicTV {
	boolean isPowerOn;
	int channel;
	int volume;

	// 모든 인스턴스를 출력
	public void showInfo() {
		System.out.println("전원: " + isPowerOn);
		System.out.println("채널: " + channel);
		System.out.println("볼륨: " + volume);
	}
}

// 스마트 티비
class SmartTV extends BasicTV {
	String ip;

	public void showInfo() {
		System.out.println("전원: " + isPowerOn);
		System.out.println("채널: " + channel);
		System.out.println("볼륨: " + volume);
		System.out.println("IP 주소: " + ip);

	}

}