package java1;

import java.util.Arrays;

public class Array11 {

	// 2차 배열 응용편
	public static void main(String[] args) {
		// 응용문제7 해당 배열값을 기준으로 짝수,홀수인지를 나열하는 배열 결과를 출력하는 코드를 작성하시오.

		int Adata[][] = { { 5, 17, 19, 22, 33 }, { 1, 2, 3, 4, 5 } };
		int ea = Adata[0].length;

		String Result[] = new String[ea];
		int x = 0;
		int sum = 0;
		while (x < ea) {
			sum = Adata[0][x] + Adata[1][x];

			if (sum % 2 == 0) {

				Result[x] = "짝수";
			} else if (sum % 2 != 0) {
				Result[x] = "홀수";

			}
//			System.out.println(sum);
			x++;
		}
		System.out.println(Arrays.toString(Result));

	}

}
