package exam;

//버튼 클릭 이벤트를 지닌 인터페이스 선언
interface button_Click_Listener {
	public void click();

}

	//버튼 객체를 
class AnonymousExample { //
	public class Button { 
		private button_Click_Listener listener; //버튼클릭 이벤트를 처리할 수 있는 listener 멤버변수
		
		//특정 리스너를 외부로부터 받는 메소드
		public void set_Button_Listener(button_Click_Listener listener) { //버튼클릭 이벤트 처리를 위해
			this.listener = listener;
		}
		
		//null이 아니면 버튼을 클릭하는 메서드. 즉, 어떤 이벤트가 들어왔을때만 동작하도록 제어함.
		public void click() {
			if(listener !=null); {
				this.listener.click();
				
			}
		}
	}
}


public class Example_06 {

	public static void main(String[] args) {
		
		//외부클래스를 통해서 버튼클래스를 선언.
		AnonymousExample exam = new AnonymousExample(); //객체생성
		AnonymousExample.Button button = exam.new Button(); //객체생성
		
		button.set_Button_Listener(new button_Click_Listener() { //익명클래스
			
			@Override
			public void click() { //메서드 재정의
				System.out.println("버튼클릭");
			}
		});
		
		button.click(); // 클릭을 하게 되면 오버라이딩된 메서드가 출력. 버튼클릭 이벤트 발생!
		
	}

}
