package exam;
import java.util.Scanner;


abstract class Converter {
abstract protected double convert(double src);
abstract protected String getSrcString();
abstract protected String getDestString();
protected double ratio;

 
public void run() {
	Scanner sc = new Scanner(System.in);
	System.out.println(getSrcString() + "을 " +
			getDestString() + "로 바꿉니다.");

	System.out.println(getSrcString() + "을 입력하세요 >> ");
	double val = sc.nextDouble();
	double res = convert(val);
	System.out.println("변환 결과 : " + res + getDestString() + "입니다.");
	
	}
}

public class Quiz1 {
	
	public static void main(String[] args) {
	/* Converter 클래스를 상속받아 원화를 달러로 변환하는 Won2Dollar 클래스를 작성하세요
	실행결과
	원을 달러로 바꿉니다.
	원을 입력하세요 >>
	24000
	변환 결과 : 20.0달러입니다.
	 */
		
		
	Won2Dollar toDollar = new Won2Dollar(1200);
	toDollar.run();
	
	
	/*
	* Converter 클래스를 상속받아 Km를 mile(마일)로 변환하는 Km2Mile 클래스를 작성하세요
	* * 실행결과)
	* Km를 mile로 바꿉니다.
	* km를 입력하세요 >> 30
	* 변환결과 : 18.75mile 입니다.
	*/
	Km2Mile toMile = new Km2Mile(1.6);
	toMile.run();
	}
	
	

}
