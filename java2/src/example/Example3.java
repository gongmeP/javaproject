package example;

import java.util.Scanner;
//응용문제1 . 
// 질문 "7000 결제 하시겠습니까?" 출력, 숫자 1을 입력시 "결제가 진행됩니다" 출력 후 프로세스 종료.
// 숫자 2를 입력하면 "결제가 취소 되었습니다." 출력 후 프로세스 종료

public class Example3 {
	final int money = 7000;
	Scanner sc = new Scanner(System.in); // 가상으로 입력 받는 메소드

	public static void main(String[] args) {
//		System.out.println("출금하실 금액은?");
		Example3 x = new Example3();
		x.x1();

	}

	void x1() {
		System.out.println(this.money + "원 결제 하시겠습니까?");
		int number = sc.nextInt();
		// String일 경우 intern 또는 equals 를 해야만 조건 확인가능

		if (number == 1) {
			System.out.println("결제가 진행됩니다.");

		} else if (number == 2) {
			System.out.println("결제가 취소 되었습니다.");

		}
		this.sc.close();
		System.exit(0);

	}

}
