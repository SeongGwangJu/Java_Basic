package student;

public class StudentMain {
		/*
		 * 정적멤버(static) : '고정된' 이란 의미를 가지고 있음
		 * - 정적멤버란 [필드와 메서드]를 선언할 때 'static'이라는 키워드가 붙은 멤버를 말함

		 * - static이라는 키워드를 사용하면 [static 변수]와 [static 메소드]를 만들 수 있고
		 * 다른 말로는 [정적 필드], [정적 메소드]라 하며 이 둘을 합쳐 정적멤버라고 함

		 * - 정적필드와 정적메소드는 '클래스'에 고정된 멤버!!

		 * - static키워드를 통해 생성된 정적멤버들은 Heap영역이 아닌 static 영역에 할당된다!!

		 * - static영역에 할당된 메모리는 모든 객체가 공유하여 하나의 멤버를 어디든지 참조할 수 있는 장점을 가지지만
		 * 가비지컬렉터의 관리영역 밖에 있으므로 프로그램 종료시까지 [메모리가 할당된 채로 존재]한다.
				->성능에 악영향을 끼친다.
				
		 *
		 *
		 */

	public static void main(String[] args) {
			Student stu1 = new Student(); //stu1은 메서드?
			stu1.studentName = "김고이";
		  stu1.hello(); //static 멤버는 클래스 명으로 접근하는게 원칙!!
			
			System.out.println("학교는 " + Student.schoolName + "입니다.");
			Student.goToSchool();
			
			System.out.println("===========");
			
			Student stu2 = new Student();
			
			stu2.studentName = "김고삼";
			stu2.hello();
			System.out.println("학교는 " + Student.schoolName + "입니다.");
			Student.goToSchool();
			
			//static으로 선언된 것들은 반드시 메모리를 해제시켜 줘야한다.
			//요점은 캐치한채로 열심히 타이핑해보는게 중요.
		
	
	}
}
