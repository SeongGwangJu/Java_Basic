package Day04;

import java.util.Scanner;

public class Example_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 87;
	
		if(score <= 100 && score >= 90) {
			System.out.println("A학점");
		} else if(score <= 90 && score >= 80) {
			System.out.println("B학점"); 
		} else if(score <80 && score >= 70) {
			System.out.println("C학점"); 
		}	else if(score <70 && score >= 60) {
				System.out.println("D학점");
			} else {
				System.out.println("F학점 낙제");
			
		}
		}
		
	}

