package java1;

import java.util.Scanner;

public class Class10 {

	public static void main(String[] args) {

		login s = new login();
	}

}

class login {

	public login() {

		log1();
	}

	public void log1() {

		String id1 = inputs("아이디를 입력하세요.");

		if (id1 == "hong") {

			String pw1 = inputs("패스워드를 입력하세요.");
			passwds(pw1);

			System.out.println("로그인 되었습니다.");
		} else {
			System.out.println("가입되지 않은 사용자 입니다.");
		}
	}

	public String inputs(String msg) {
		Scanner sc2 = new Scanner(System.in);
		System.out.println(msg);
		String result = sc2.next().intern();

		return result;
	}

	public void passwds(String pw1) {
		int x = 0;

		while (x <= 3) {

			if (pw1 == "a123456") {

				x = 3;
			} else {

				x++;
			}

		}

	}

}
