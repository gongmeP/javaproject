package java1;

import java.util.Scanner;

public class index10 {

	public static void main(String[] args) {
		//for문 + scanner
		
		//응용문제2
		//원하는 구구단 숫자를 입력하세요 
		// 사용자가 원하는 숫자를 입력하면 해당 숫자에 맞는 구구단이 출력되도록 하시오
		
		Scanner num1 = new Scanner(System.in);
		System.out.println("구구단 숫자를 입력하세요");
		int numbers = num1.nextInt();
		int x ;
		int sum;
		
		
		num1.close();
		
		for(x=1; x<=9; x++) {
			sum = x*numbers;
			System.out.printf("\n%d * %d = %d",numbers,x,sum);
			
		}
		
		
		

	}

}
