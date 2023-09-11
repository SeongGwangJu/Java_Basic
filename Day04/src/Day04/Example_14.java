package Day04;

public class Example_14 {
	public static void main(String[] args) {
		/*
		 * equals()
		 * -두 개의 문자열이 동일한 지 동일하지 않은지 판단!!
		 * -모든 객체의 부모 클래스인 Object에 정의되어 있는 메소드
		 */
		String str1 ="Hello";
		String str2 ="World";
		String str3 ="Hello";
		if(str1.equals(str2)) {
			System.out.println("같습니다");
		} else if(str1.equals(str3)) {
			System.out.println("str1문자열과 str3문자열이 같습니다.");
		} else {
			System.out.println("세 문장 모두 다릅니다");
		}
	
		}
	}
