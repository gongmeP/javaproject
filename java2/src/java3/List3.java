package java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class List3 {

	public static void main(String[] args) {

		// 응용문제3
		// 3 6 9 12 15
		// 2 4
		// 2 3 4 6 9 12 15

		Integer a[] = { 3, 6, 9, 12, 15 };
		Integer b[] = { 2, 4 };

		ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(a));
		ArrayList<Integer> b1 = new ArrayList<>(Arrays.asList(b));

		a1.addAll(b1);
//		a1.add(0,b1.get(0));
//		a1.add(2,b1.get(1));
		Collections.sort(a1);
		System.out.println(a1);

		// 무한루프
		Scanner sc = new Scanner(System.in);
		while (true) { // 무한루프 사용형태 (while, do~while 에서만 사용)
			System.out.println("숫자를 입력하세요");
			int x = sc.nextInt();
			if (x == 10) { // 사용자가 10을 입력시 루프 종료
				break;
			}
		}
		sc.close();
	}
	

}
