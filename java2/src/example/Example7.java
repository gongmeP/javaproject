package example;

import java.util.Arrays;
import java.util.Scanner;

public class Example7 {

	// 응용문제3. 사용자가 총 7개의 숫자를 입력. 7개의 숫자 중 짝수 값이 몇개 입력되었는지 출력 , 최종 배열값도 출력
	Integer data[] = new Integer[7];
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Example7 x = new Example7();
		x.su();

	}

	void su() {
		System.out.println("숫자를 7개를 입력하세요.");
		int x = 0;
		int ea = data.length;

		int cnt = 0;
		while (x < ea) {

			data[x] = sc.nextInt();

			if (data[x] % 2 == 0) {

				cnt++;
			}
			x++;

		}
		System.out.printf("입력된 숫자중 짝수의 갯수는 %d 개 이며, 최종 배열값은 %s 입니다.", cnt, Arrays.toString(this.data));
		sc.close();

	}

}
