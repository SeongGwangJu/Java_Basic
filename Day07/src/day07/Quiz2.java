package day07;

public class Quiz2 {

	public static void main(String[] args) {
		/*
		 *Math.random() 메소드를 이용해서 두개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2)형태로 출력하고
		 *눈의 합이 5가 아니면 계속 주사위를 던지고
		 *눈의 합이 5이면 실행을 멈추는 코드를 작성하세요
		 */
		
		for(int i = 1; i<1000; i++) {
			int random1 = (int) (Math.random()*6)+1;
			int random2 = (int) (Math.random()*6)+1;
			
			if (random1 + random2 == 5) {
				System.out.println(i + "번째 만에 두 눈의 합이 5입니다.");
				break;
			}
		}
		
		//2nd
		int k = 1;
		while(true) {
			int random3 = (int) (Math.random()*6) + 1;
			int random4 = (int) (Math.random()*6) + 1;
			
				if (random3+random4 == 5) { 
					System.out.println(k +"번째시도 두 눈의 합이 5입니다");
					break;
				} k++;
			}
		
		//Answer
		while(true) {
			//눈의 합이 5가 아니면 루프 계속 실행
			int dice1 = (int) (Math.random() *6) +1;
			int dice2 = (int) (Math.random() *6) +1;
			System.out.printf("(%d,%d) \n", dice1, dice2);
			if(dice1 + dice2 ==5) { //눈의 합이 5이면}
				break;
			}
		}
		}
	}

	

