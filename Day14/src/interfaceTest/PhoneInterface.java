package interfaceTest;

public interface PhoneInterface { //인터페이스는 클래스들 간의 공통된 동작을 정의하기 위해 사용.
	//상수
	final int TIMEOUT = 10000; //TIMEOUT은 final 상수로 선언된 변수로 10000으로 초기화되었다.
	
	//추상메서드(시그니처만 정의하고 구현내용은 없다. 구현클래스에서는 이 두 메서드를 구현해야 한다.)
	void sendCall(); 
	void receiveCall(); //추상메서드
	
	//디폴트 메서드
	default void printLogo() { 
		System.out.println("** Phone **");
		
		/* 
		 * 또한, printLogo()라는 디폴트 메서드. 구현클래스에서 오버라이딩 가능.
		 * 인터페이스를 구현하는 클래스는 해당 인터페이스의 메서드를 모두 구현해야 하며, 
		 * 이를 통해 일관된 동작을 보장할 수 있습니다.
		 */
	}
}
