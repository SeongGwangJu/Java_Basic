package quiz;

class Tv{
	//필드
	public String brand;
	public int year;
	public int inch; 
	
	//생성자
	public Tv(String brand, int year, int inch) {
	this.brand = brand;
	this.year = year;
	this.inch = inch;
	}
	
	//출력 메소드
	public void show() {
		System.out.println(this.brand + "에서 만든 " + this.year + "년형 " 
	+ this.inch + "인치 TV"); 
	}
}
public class TvMain {

	public static void main(String[] args) {
		/*
		 * 다음 main() 메소드를 실행하였을 때
		 * 다음과 같이 출력되는 tv 클래스를 작성하세요
		 * 
		 * LG에서 만든 2017년형 32인치 TV
		 */
		Tv tv = new Tv("LG", 2017, 32);
		tv.show();
	
	}

}
