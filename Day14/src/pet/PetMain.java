package pet;

public class PetMain {

	public static void main(String[] args) {
		
    Pet dog = new Dog(); //Dog 클래스가 Pet 클래스를 상속받았기 때문에, Pet타입으로 참조변수를 선언하고 new Dog()를 할당할 수 있다.
    dog.walk(); // 출력: Dog is walking.
    dog.eat(); // 출력: Dog is eating.
    System.out.println("Dog //");
    dog.run();
    
    /*
     * Pet 추상클래스를 상속받은 하위클래스에서 추상메서드를 구현하고, 하위클래스의 객체를 생성해 사용함으로써 Pet클래스의 기능을 구체화 할 수 있다.
     */
	}

}
