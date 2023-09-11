package day07;

public class Example_03 {

	public static void main(String[] args) {
		/*
		 * 구구단 중 짝수단만 출력!
		 */
		
	for( int i=2; i<=9; i+=2) {
		for( int j = 1; j<=9; j++) {
			System.out.println(i + "*" + j + " = " + i*j );
		}
	 }
	System.out.println("==========");
	
	//강사님 풀이
	for(int i=2; i<=9; i++) {
		if(i%2 !=0) {		// 2로 나눴을 때 0으로 나눠떨어지지 않는다면
			continue;	//위로 돌아감
		} 
		for(int j = 1; j<=9; j++) { 		//2로 나눴을때 0으로 떨어지면 안쪽 for문 실행됨
				System.out.println(i + "*" + j + " = " + i*j );
		}
	}
	}

}
