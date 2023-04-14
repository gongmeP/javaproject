package java1;

import java.util.Scanner;

public class index11 {

	// while , do~while문
	public static void main(String[] args) {

		int a = 1;
		while (a < 10) {
//			System.out.println(a);
			a++;
		}

		int b = 1;
		do {
//              	System.out.println(b);		
			b++;
		} while (b < 10);

		// 응용문제 3
		// 사용자가 두개의 숫자를 입력합니다. 두 숫자의 범위에 있는 모든값을 더하는 코드를 작성

		Scanner num = new Scanner(System.in);
		System.out.println("두개의 숫자를 입력해주세요.");
		int num1 = num.nextInt();
		int num2 = num.nextInt();
		int sum = 0;

		num.close();

		while (num1 <= num2) {
			sum += num1;
			System.out.printf("+%d", num1);

			num1++;
		}
		System.out.printf(" : %d", sum);

	}

}
