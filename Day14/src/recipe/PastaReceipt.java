package recipe;

public class PastaReceipt extends Receipt { //Recepit 클래스 상속
	
	public PastaReceipt(String chef) { //상위클래스 Receipt의 생성자 호출.
		super(chef); //Receipt 클래스의 생성자 호출해 셰프의 이름을 전달 -> PastRecepit 객체를 생성할 때 셰프의 이름 지정가능.
	}

	void makeSource() {
		System.out.println("파스타 소스를 직접 만듭니다.");
	}
}
