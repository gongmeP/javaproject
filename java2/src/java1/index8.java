package java1;

import java.util.Scanner;

public class index8 {

	public static void main(String[] args) {
		// Scanner 와 문자열 비교

		Scanner a = new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		String mid = a.next().intern();
		// intern() : 문자에 한해서 조건문에 equals 를 사용하지 않고 연산자 기호로 처리할때 사용

		// equals "=="
//		if(mid.equals("kim")|| mid.equals("park")) {
		if (mid == "kim" || mid == "park") {
			System.out.println("회원이 확인 되었습니다.");
		} else {
			System.out.println("비회원 입니다.");
		}

		// 응용문제 1.
//		사용자가 원하는 숫자를 입력합니다.
//		해당 숫자가 100 이하 숫자만 입력해야만 하며 100 초과일 경우 "숫자는 100 까지만 입력 가능합니다. 라는 메세지가 출력되도록 제작"

		Scanner num = new Scanner(System.in);
		System.out.println("1~100 까지 숫자를 입력하세요");
		int numbers1 = num.nextInt();

		if (numbers1 > 100) {
			System.out.println("숫자는 100까지만 입력 가능합니다.");
		} else {
			if (numbers1 % 2 != 0) {
				System.out.println("입력하신 숫자는 홀수 입니다.");
			} else if (numbers1 % 2 == 0) {
				System.out.println("입력하신 숫자는 짝수 입니다.");
			}
		}
		a.close();
		num.close();

	}

}
