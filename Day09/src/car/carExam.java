package car;

public class carExam {
	public static void main(String[] args) {

		Car car = new Car(); //car 클래스를 이용해 car 인스턴스 생성
		System.out.println("wheel의 개수는" + car.wheel + "개 입니다.");
		
		car.wheel = 5; //car 클래스의 wheel의 값을 5로 변경
		System.out.println("wheel의 개수는" + car.wheel + "개 입니다.");
		
		car.ride(); //car 클래스의 ride 메소드를 불러온다
		car.stop();
	}
	
}
