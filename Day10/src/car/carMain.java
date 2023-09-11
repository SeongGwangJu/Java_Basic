package car;

public class carMain {

	public static void main(String[] args) {
		Car car = new Car(); //필드에 접근할때는 인스턴스 변수명으로 접근
		
		//필드값 출력
		System.out.println("회사 : " + car.company);
		System.out.println("모델명 : " +car.model);
		System.out.println("색깔 : " + car.color);
		System.out.println("최고속도 : " + car.maxSpeed);
		System.out.println("현재속도 : " + car.speed);
		
		//필드값 변경
		car. speed = 60;
		System.out.println("현재속도 : " + car.speed);
	}

}
