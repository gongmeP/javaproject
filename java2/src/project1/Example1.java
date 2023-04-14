package project1;

import java.util.Scanner;

public class Example1 {
	// 업 다운 퀴즈.
	// PC가 1~10까지 임의의 숫자를 선택 . 단 interface 사용

	// "1~10" 숫자를 입력하세요 . 라는 메세지와 함께 사용자가 숫자를 선택

	// 결과는 pc가 4라는 숫자를 선택했고, 사용자가 8이라는 숫자를 선택했으면 Down 사용자가 1을했으면 up 메세지 출력
	// 횟수는 4회만 할수있도록. pc가 뽑은 숫자와 사용자가 뽑은 숫자가 일치할경우 "정답" 출력
	// 메세지 출력이 4회 이상되면 "정답을 맞추지 못했습니다." 출력

	public static void main(String[] args) {

		abc st = new abc();
		st.games();
	}

}

class abc implements numinter {
	Scanner sc;

	@Override
	public void games() {
		System.out.println(this.number);

		sc = new Scanner(System.in);
		System.out.println("1~10까지 업,다운 게임 입니다.");
		int cnt = 0;

		while (true) {
			try {
				System.out.printf("1~10까지 숫자를 입력하세요. 오답 횟수(%d회) \n", cnt);
				Integer in = sc.nextInt();
				if (in > 10) {
					System.out.println("1~10 숫자만 입력해주세요");
					continue;

				} else {

					if (cnt == 4) {
						System.out.println("정답을 맞추지 못했습니다.");
						break;

					}

					if (in > number) {
						System.out.println("Down");
						cnt++;
					} else if (in < number) {
						System.out.println("UP");
						cnt++;
					} else if (in == number) {

						System.out.println("정답");
						break;
					}
				}

			} catch (Exception e) {
				System.out.println("1~10 숫자만 입력하세요");
				continue;
			}
		}

	}
}
