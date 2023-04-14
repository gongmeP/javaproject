package java1;

public class Array12 {

	public static void main(String[] args) {
		// 응용문제8 데이터 배열에 있는 모든 짝수값 합산 결과를 출력

		int data[][] = { { 11, 42, 22, 16 }, { 7, 33, 10, 29 } };

		int ea = data[0].length;
		int x = 0;
		int sum = 0;
		while (x < ea) {
			if (data[0][x] % 2 == 0) {
				sum += data[0][x];

			}
			if (data[1][x] % 2 == 0) {
				sum += data[1][x];
			}

			x++;
		}
		System.out.println(sum);

	}

}
