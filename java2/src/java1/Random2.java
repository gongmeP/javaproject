package java1;

import java.util.Arrays;

public class Random2 {

	// random으로 활용법
	public static void main(String[] args) {
		// 응용문제1
		// pc가 1~46까지의 숫자 6개를 무작위로 생성 합니다.
		// 해당 6개의 숫자를 배열화 하여 출력하시오

		int x = 0;
		int ran[] = new int[6];
		while (x <= 5) {

			int number1 = (int) Math.ceil(Math.random() * 46);
			System.out.println(number1);
			ran[x] = number1;

			x++;
		}
		System.out.println(Arrays.toString(ran));

	}

}
