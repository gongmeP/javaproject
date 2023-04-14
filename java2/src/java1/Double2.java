package java1;

public class Double2 {

	public static void main(String[] args) {

		// 응용문제6.
		// 구구단 9단 중 9*64까지 숫자 중
		// 홀수값에 대한 평균값 결과를 출력 하시오.

		int x = 1;
		int y = 9;

		int sum = 0;
		int sum2 = 0;
		int cnt = 0;

		while (x <= 64) {
			sum = y * x;

			if (sum % 2 != 0) {

				sum2 += sum;
				cnt++;
//				System.out.println(sum);

			}

			x++;
		}
		sum2 = sum2 / cnt;
		System.out.println(sum2);

	}

}
