package pet;

public class Dog extends Pet {
	//walk와 eat 메서드를 오버라이딩 해 구체적인 동작을 구현.
	@Override
	public void walk() {
		System.out.println("Dog is walking");
	}

	@Override
	public void eat() {
		System.out.println("Dog is eating.");
	}

}
