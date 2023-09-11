package Animal;

abstract class Animal {
	abstract void cry();
}

class Pig extends Animal {
//아래의 Override가 없으면 pig에 밑줄이 뜨는데, add unimplement method 추가하면 됨
	/*
	 *  *오류메시지에 대한 설명
	   	추상 클래스(Abstract Class)를 상속받은 클래스가 추상 메서드(Abstract Method)를 구현하지 않았을 때 발생하는 오류입니다.
			여기서 "The type Pig must implement the inherited abstract method Animal.cry()"라는 메시지는 
			"Pig 클래스는 Animal 클래스로부터 상속받은 추상 메서드인 cry()를 구현해야 합니다"라는 의미입니다.
	 */
	
	@Override
	void cry() {
		//재정의해서 사용하면 된다.
	} 
	
}


public class Farm {  // animal 객체의 cry() 메서드를 호출하여 동물의 소리를 출력하는 메서드
	void sound(Animal animal) {
		animal.cry(); //매개변수 참조 객체의 오버라이딩 된 메소드를 호출
	// 매개변수 참조 객체의 오버라이딩된 메소드를 호출
	}
		public static void main(String[] args) {
			Farm farm = new Farm();
			farm.sound(new Pig()); // Pig 객체의 cry() 메서드를 호출하여 돼지의 소리 출력
			
		}
}
