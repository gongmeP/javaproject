package java1;

import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {

		Member2 mb = new Member2();
		mb.list("홍길동", 5);

		// 응용문제5
		// Member2 class 를 활용하여 사용자가 직접 입력 한 숫자 구구단 출력

		Scanner gu = new Scanner(System.in);
		System.out.println("구구단 숫자를 하나 입력 해주세요");
		int x = gu.nextInt();
		mb.as(x);

	}

}

class Member2 {
	// 일반 메소드는 인자값을 복합적으로 적용 가능
	public void list(String user, int level) {

		System.out.printf("고객명 : %s \nlevel : %d \n ", user, level);
	}

	public void as(int gu) {

		int x = 9;
		int sum = 0;
		while (x >= 1) {

			sum = gu * x;
			System.out.printf("%d * %d = %d \n", gu, x, sum);
			x--;
		}

	}
}