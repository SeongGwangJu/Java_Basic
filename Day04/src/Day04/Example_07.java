package Day04;

public class Example_07 {

	public static void main(String[] args) {
		/*
		 * 조건문(if) 
		 * - 조건식의 결과에 따라 종속 문장(블록 내의 문장)의 실행여부가 결정 - 조건식의 연산결과가 true이면 블록 내 문장을
		 * 실행하고 false이면 실행하지 않는다.
		 * -if문의 조건식에는 boolean 변수 또는 true와 false값을 산출할 수 있는 연산식이 올 수 있음.
		 * -else문은 단독으로 사용불가. if문이 있어야 사용가능.
		 * -if문의 실행문이 실행될 경우 if ~ else문을 바로 벗어남!!
		 * -형식)
		 *  if(조건식) { 실행문.. } 
		 *  else { 실행문.. }
		 */
		int score = 70;
		if(score >= 60) {
			System.out.println("pass!");
		} else {
			System.out.println("fail!");
		}
		//블록('{}')없이도 가능
		if(score >=60)
			System.out.println("pass!");
		else
			System.out.println("fail");
		
	
	}

}
