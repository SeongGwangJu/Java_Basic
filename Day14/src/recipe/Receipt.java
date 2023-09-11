package recipe;

public class Receipt {
	String chef; //셰프의 이름 문자열 필드
	
	public Receipt(String chef) { //셰프의 이름을 매개변수로 받아서 chef 필드에 저장
		this.chef = chef; //매개변수로 받은 값을 chef 필드에 할당
	}
	
	void info() { //레시피 정보를 출력하는 메서드
		System.out.println("이 레시피는 " + chef + "셰프님의 레시피입니다."); //레시피 정보 출력
	}
}
