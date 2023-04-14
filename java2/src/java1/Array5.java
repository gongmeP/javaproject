package java1;

public class Array5 {

	public static void main(String[] args) {

		int x[] = { 15, 60, 11, 14, 27 };
		// 응용문제3 배열데이터를 모두 합한 결과값을 출력하시오
		// 15 60 11 14 27 > 127;

		int ea = x.length;

		int sum = 0;

		// for in 과 동일한 형태의 배열전용 반복문
		for (int f : x) {
			sum += f;
//			System.out.println(f);
		}
//		System.out.println(sum);

		String id[] = { "hong", "kim", "park", "lee", "jang", "jung" };
		// 응용문제4
		// id 데이터중 4글자 이상인 아이디만 출력하시오

		for (String w : id) {

			if ((w.length()) >= 4) {
				System.out.println(w);

			}

		}
	}

}
