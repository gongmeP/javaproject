package java1;

import java.util.Scanner;

public class Random1 {

	// random 메소드 + 재귀메소드(자신의 메소드를 호출 / 다른 메소드를 호출)
	public static void main(String[] args) {
		// Math.ceil : 올림
		// Math.floor : 절삭
		// Math.round : 반올림

		int number = (int) Math.ceil(Math.random() * 5);
		System.out.println(number);

		// 컴퓨터가 하나의 숫자를 뽑고 해당 숫자를 맞추는 겜. 틀릴경우 컴퓨터는 다른 숫자를 뽑음
		game g = new game();
		g.pc();
	}

}

class game {
	Scanner sc = new Scanner(System.in);
	// this 는 해당 class 안에서 사용되는 모든것을 지칭

	public void pc() {

		int ai = (int) Math.ceil(Math.random() * 5);
		// 1~5까지 pc가 무작위 숫자를 선택

		System.out.println("1~5까지 숫자 중 하나를 입력하세요.");
		int person = this.sc.nextInt();

		if (ai == person) {
			System.out.println("정답");
			sc.close();
		} else {
			System.out.println("실패");
			this.pc(); // 재귀함수로 자신의 메소드를 다시 재호출
		}
	}
}
