package quiz;
class TV {
	private int size;
	
	public TV(int size) {
		this.size = size;
	}
	
public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
public class TvMain {
	
	/*다음 TV클래스가 있고
	 * main() 메소드의 실행결과를 참고하여 TV클래스를 상속받은 ColorTV 클래스를 작성하세요
	 * 
	 * 실행결과) 
	 * 32인치 검정색
	 */
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, "검정색");
		myTV.printproperty();
}
	}

}
