package test2;

import test1.Test;

public class TestMain2 {
			public static void main(String[] args) {
				
				Test test = new Test();
				//public 접근
				test.public_name = "홍길동";
				System.out.println(test.public_name);
				//testMain1에서도, 2에서도 public은 접근이 가능하다.
				
			//protected 접근
				//TestMain2 testmain2 = new TestMain2();
				
				//testmain2.protected_name = "홍길동";
				//System.out.println(testmain2.protected_name);
			//다른 패키지에 있어서 불러올 수 없다. 불러올려면 상속을 받아야함.
				
				/*
				 * public class TestMain2 extends Test {
				 * 
				 * public TestMain2() { super(); }
				 * 을 위에다 추가하면 상속 됨. 이건 참고
				 */ 
				
			//default 접근
			//private 접근 : getter setter 접근
				test.setPrivate_name("장독대");
				System.out.println(test.getPrivate_name());
				
			//오류나는게 정상인데 안난다?				
				
				
				
				
				
			}
		

	}


