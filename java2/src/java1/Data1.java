package java1;

public class Data1 {
	// 전역 배열 변수 작성
	String[] user = { "hong", "kim", "park" };
	int number = 0;

	public void userlist() {
//		String user[] = { "hong", "kim", "park" };
//		System.out.println(Arrays.toString(user));

		this.number = 100; // this : 전역변수 지칭함
		int w = 0;
		while (w < 3) {
			System.out.println(user[w]); // 반복문으로 배열값 출력
			w++;
		}

	}
}
