package ex03;

public class Example_05 {

	public static void main(String[] args) {
		/*
		 * 증감 연산자*(++, --)
		 * 형식)
		 * int a = 10;
		 * a++(후위증감) or ++a(전위증감)
		 * 
		 * -변수의 값을 1증가 시키거나, 1감소시킨다.
		 * -변수명 앞에 증감연산자가 있을 경우 전위 증감,
		 * -변수명 뒤에 증감연산자가 있을 경우 후위 증감
		 * 
		 * 전위증감 : 그 라인에서 변수를 1증가 또는 감소 
		 * 후위증감 : 다음 라인에서 변수를 1증가 또는 감소
		 */
		int a = 10;
		int b = 10;
		System.out.println("a = " + ++a);
		System.out.println(a++);
		System.out.println(++a);
        System.out.println(a);
        ++a;
        System.out.println(a);
		System.out.println("b = " + b++);
		System.out.println("앞에 b++가 붙었기 때문에 " +b + "(다음 라인의 값에 +1이 되어 돌아온다)");
		
		int n1 =1;
		int n2 = 1;
		int result1 = --n1;
		int result2 = n2--;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(n2); // 앞 라인에 후위증감이 있어서 1이 0으로 출력된다
		
		char x = 'x';
		System.out.printf("유니코드 %d = '%c'\n",(int)x,x++);
		System.out.printf("유니코드 %d = '%c'",(int)x, x);
		
				
	}
		
}
