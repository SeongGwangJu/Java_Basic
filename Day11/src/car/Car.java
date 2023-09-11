package car;

public class Car {
	String company = "삼성자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 오버로딩
	Car() {
		
	}
	
	Car(String model){ // 참고 : car앞에 접근제한자가 없으면 default
		this.model = model; 
		
	}
	Car(String model, String color) { //위의 Car와 매개변수 개수가 다르다.
		this.model = model;
		this.color = color;
		
	}
	Car(String model, String color, int maxSpeed) { //위의 Car와 매개변수 개수가 다르다.
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}