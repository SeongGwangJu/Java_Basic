package exam;

public class Example_09 {

	public static void main(String[] args) {
		
		try {
			String[] strArray = null;
			System.out.println("strArray[0] = " + strArray[0]);
		} catch(NullPointerException e) {
			System.out.println("에러메시지 : " + e.getMessage());
			System.out.println("에러메시지 해석 : strArray 배열이 Null이므로 개체 배열에서 로드할 수 없습니다.");
		}
	}

}
