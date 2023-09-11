package pet;

abstract public class Pet {
	abstract public void walk(); //추상메소드
	abstract public void eat();		//추상메서드
	
	public int health; // 필드
	
	public void run() { // 문자열 출력 메서드
		System.out.println("run");
		 
		/* 추상클래스 Pet은 직접 객체를 생성할 수 없다. 하지만 하위클래스에서 walk()와 eat()메서드를 구현한 후 
		 * 하위클래스의 객체를 생성하여 사용할 수 있다.
		 * 
		 */
	}
}
