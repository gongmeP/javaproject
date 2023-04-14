package java1;

public class Double1 {

	public static void main(String[] args) {
		// 응용문제5 do while 문
		// 다음과 같이 합계를 출력하는 loop 문을 작성하시오.
		// 5+5 = 10
		// 5+4 = 9 ... 2+1=3

		int x = 5;

		int sum = 0;

		do {
			int y = 5;
			do {
				sum = x + y;
				System.out.printf("\n%d+%d=%d", x, y, sum);

				y--;
			} while (y >= 1);
			x--;
		} while (x >= 2);

	}

}
