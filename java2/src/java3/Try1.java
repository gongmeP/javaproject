package java3;

import java.util.Scanner;

public class Try1 {
	//예외처리 방식

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int box;
		// try~catch : 예외 처리문
		try { // 오류 발생 체크

			System.out.println("숫자를 입력하세요.");
			box = sc.nextInt();
			System.out.println("사용자는" + box + "를 입력했습니다.");

		} catch (Exception e) { // try오류 발생시 catch 실행
			System.out.println("숫자만 입력하세요");
			System.out.println(e);
		}

	}

}
