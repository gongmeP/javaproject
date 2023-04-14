package java1;

import java.util.Scanner;

public class Array3 {

	// 배열 응용
	public static void main(String[] args) {
		String user[] = { "hong", "kim", "park", "jang", "han" };

		// 응용문제 사용자가 아이디를 입력
		// "아이디를 입력하세요"
		// 해당 아이디를 입력 후 동일한 아이디가 있을 경우
		// "해당 아이디를 확인했습니다" 출력
		// 없으면 "미가입자 입니다" 출력
		// 외부 class 이용

		Arr near = new Arr(user);

	}

}

class Arr {

	public Arr(String user[]) {
		Scanner id1 = new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		String x1 = id1.next().intern();
		id1.close();
		int ea = user.length;
		int x = 0;
		int cnt = 0;
		while (x < ea) {
			if (x1 == user[x]) {
//				System.out.println("해당 아이디를 확인 했습니다.");
				cnt++;

			}

			x++;
		}
		if (cnt == 0) {
			System.out.println("미가입자 입니다.");
		} else {
			System.out.println("해당 아이디를 확인 했습니다.");
		}

	}
}
