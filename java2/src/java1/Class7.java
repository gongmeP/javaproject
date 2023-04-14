package java1;

import java.util.Scanner;

public class Class7 {
	// 응용편 : 회원가입시 약관 동의 및 간편회원 가입 진행
	public static void main(String[] args) {
		// 해당 코드는 단 한줄로만 표현합니다.(외부 클래스 기준으로만 코드 작성)
//      User9 info = new User9();
		Ship s = new Ship();

	}
}

class Ship {
	public Ship() {
		agree();
	}

	public void agree() {
		String ag1 = inputs("회원가입 약관에 동의하시겠습니까?(y/n) : ", "");
		if (ag1.equals("y")) {
			String ag2 = inputs("아이디를 입력하세요: ", "");
			if (ag2.equals("admin")) {
				System.out.println("해당아이디는 중복되었습니다.");
			} else {
				String ag3 = inputs("패스워드를 입력하세요 : ", "");
				String ag4 = inputs("가입자명를 입력하세요 : ", "y");
				System.out.printf("아이디 : %s 패스워드 : %s 가입자명 : %s", ag2, ag3, ag4);
			}
		} else {
			System.out.println("회원가입이 취소되었습니다.");
			System.exit(0);
		}
	}

	public String inputs(String msg, String exit) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		String result = sc.next();
		if (exit.equals("y")) {
			sc.close();
		}
		return result;
	}

}
