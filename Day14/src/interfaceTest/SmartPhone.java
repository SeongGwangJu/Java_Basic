package interfaceTest;

//SmartPhone 클래스는 PDA클래스를 상속받고
//MobilePhoneInterface, MP3Interface 선언된 추상메소드를 모두 구현

public class SmartPhone extends PDA 
implements MobilePhoneInterface, MP3Interface {


	@Override
	public void sendCall() {
		System.out.println("따르르릉~~!!");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화 왔어요.");
	}

	@Override
	public void sendSMS() {
		System.out.println("문자 보냅니다.");
	}

	@Override
	public void receiverSMS() {
		System.out.println("문자 왔어요.");
	}

	@Override
	public void play() {
		System.out.println("음악연주합니다.");
	}

	@Override
	public void stop() {
		System.out.println("음악 중단합니다.");
	}

	public void schedule() {
		System.out.println("일정 관리합니다.");
	}
}
