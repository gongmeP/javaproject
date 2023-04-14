package java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class List2 {

	// kim 사용자 외에 나머지 사용자를 출력

	public static void main(String[] args) {

		String user[] = { "hong", "kim", "park", "jang" };

		ArrayList<String> al = new ArrayList<>(Arrays.asList(user));

		int ea = al.size();
		int x = 0;
		while (x < al.size()) {

			if (al.get(x).equals("kim")) {
				al.remove(x); // remove 시 배열 번호가 변경됨. al.size 투입
			}
			x++;
		}

//		System.out.println(al);

		// 문제
		// 해당 배열을 확인 후 짝수의 숫자를 모두 삭제하여 최종 결과배열을 출력
		// 10 7 6 1 11 37 41 22
		// > 7 1 11 37 41

		Integer abc[] = { 10, 7, 6, 1, 11, 37, 41, 22 };
		ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(abc));

		
		int x1 = 0;

		while (x1 < al2.size()) {

			if (al2.get(x1) % 2 == 0) {
				al2.remove(x1);

			}
			x1++;
		}
		//오름차순
//		Collections.sort(al2);
		
		//내림차순
		Collections.sort(al2,Collections.reverseOrder());
		System.out.println(al2);

	}

}
