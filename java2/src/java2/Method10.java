package java2;

import java.util.Arrays;

//setter , getter
public class Method10 {

	private String name = null;
	private String subject = null;


	private String sign = "false";

	public String gtdata() { // getter

		return sign; // 최종 결과값을 9번으로 전달

	}

	public void score(String name, String subject) {
		//9번에서 입력한 값을 받아옴
		this.name = name;
		this.subject = subject;
		String user[][] = { { "홍길동", "이순신", "유관순", "강감찬", "장보고" }, { "80", "77", "92", "67", "100" }, // 국어
				{ "40", "100", "80", "92", "67" }, // 수학
				{ "95", "88", "42", "98", "50" }, // 과학
				{ "40", "92", "100", "95", "30" } // 역사
		};

		int x = 0;
		int ea = user[0].length;

//		System.out.println(ea);

		while (x < ea) {

			if (user[0][x].equals(this.name)) {
				int y = 1;
				this.sign = "";
				while (y < ea) {
					// 과목명 체크
					switch (this.subject) {
					case "국어":
						this.sign = user[1][x];
						break;
					case "수학":
						this.sign = user[2][x];
						break;
					case "과학":
						this.sign = user[3][x];
						break;
					case "역사":
						this.sign = user[4][x];
						break;

					case "전체":
						this.sign += user[y][x]+",";
						
						break;
						
					default:
						this.sign = "해당 데이터는 없습니다";
						break;
					}
//					System.out.println(user[y][x]);

					y++;
				}

			}

			x++;

		}

	}
}
