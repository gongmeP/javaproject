package java2;

public class Method6 {

	// 배열 데이터를 이용하여 홀수 값에 대한 총 갯수 받기 ()
	public static void main(String[] args) {

		mysql m = new mysql();
		String number = m.check("홀수");
		System.out.printf("총 갯수는 %s 입니다.", number);
	}

}

// 15 22 17 14 32 35 19 33 
class mysql {
	// DB값중 홀수값에 대한 총 갯수를 받고자 합니다.
	// 해당 갯수를 출력 될수있도록 코드 작성
	private int dbdata[] = { 15, 22, 17, 14, 32, 35, 19, 33 };

	public String check(String order) {

		int ea = dbdata.length;

		int x = 0;
		int cnt = 0;
		if (order.equals("홀수")) {

			while (x < ea) {

				if (dbdata[x] % 2 != 0) {
					cnt++;
				}
				x++;
			}

		}

		return Integer.toString(cnt);
	}

}