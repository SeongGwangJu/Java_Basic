package phone;

public class SamsungPhone implements Phone{
//위에까지만 치면 빨간줄 뜨고 자동완성 -인터페이스 안에있는 함수를 override
	
	@Override
	public void sendCall() {
		System.out.println("따르르릉~~");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}

}
