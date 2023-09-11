package Day04;

public class Example_06 {

	public static void main(String[] args) {
		/*
		 * 중첩 삼항연산자
		 * - 
		 */
		int num = 5;
		char c = 'a';
		String result = (num == 5) ? (c == 'A') ? 
				"num은 5, c는 A" : "num은 5, c는 A가 아님" : "num은 5가 아님";
				//= O-O	: O-X  :X-0	
			
		System.out.println(result);
	
				
	}

}
